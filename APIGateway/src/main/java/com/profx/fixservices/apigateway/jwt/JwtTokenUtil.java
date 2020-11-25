package com.profx.fixservices.apigateway.jwt;

import java.util.Date;
import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;



import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtTokenUtil {
	private static final Logger logger = LoggerFactory.getLogger(JwtTokenUtil.class);
	
	private final int ACCESS_TOKEN_VALIDITY_SECONDS=60 * 60 * 10;
	
	 @Value("${jwt.security.key}")
	    private String jwtKey;
	 
	    public String doGenerateToken(String subject) {
	        Claims claims = Jwts.claims().setSubject(subject);
	        return Jwts.builder()
	                .setClaims(claims)
	               
	                .setIssuedAt(new Date(System.currentTimeMillis()))
	                .setExpiration(new Date(System.currentTimeMillis() + ACCESS_TOKEN_VALIDITY_SECONDS*1000))
	                .signWith(SignatureAlgorithm.HS256, jwtKey)
	                .compact();
	    }

	    public String getUsernameFromToken(String token)throws Exception{
	    	return "admin";
	    }
	    
	    public Boolean validateToken(String token, UserDetails userDetails) {
			final String username = extractUsername(token);
			return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
		}
	    
//	    public Boolean validateToken(String token, AuthRequest userDetails) {
//			final String username = extractUsername(token);
//			return (username.equals(userDetails.getUserName()) && !isTokenExpired(token));
//		}
	    
	    public String extractUsername(String token) {
			return extractClaim(token, Claims::getSubject);
		}

		public Date extractExpiration(String token) {
			return extractClaim(token, Claims::getExpiration);
		}

		public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
			final Claims claims = extractAllClaims(token);
			return claimsResolver.apply(claims);
		}

		private Claims extractAllClaims(String token) {
			return Jwts.parser().setSigningKey(jwtKey).parseClaimsJws(token).getBody();
		}

		private Boolean isTokenExpired(String token) {
			return extractExpiration(token).before(new Date());
		}
		
	//	getUsernameFromToken
}
