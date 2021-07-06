package com.cognizant.authorizationService.service;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 * This class consists of all security related functions.
 */ 
@Component
public class JwtUtil {
	   private String secretKey = "secretkey";
	   
	   /**
		* @param token
		* returns extracting claims
		*/
	    public String extractUsername(String token) {
	    
	    }
	    
	    /**
		 * @param token
		 * returns extracting expiry
		 */ 
	    public Date extractExpiration(String token) {
	        
	    }
	    
	    /**
		 * @param token
		 * returns extracting claims
		 */ 
	    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
	        
	    }
	    
	    /**
		 * @param token
		 * returns extracting claims
		 */ 
	    private Claims extractAllClaims(String token) {
	    
	    }
	    
	    /**
		 * @param userDetails
		 * returns creating token
		 */ 
	    public String generateToken(UserDetails userDetails) {
	        
	    }
	    
	    /**
		 * @param claims
		 * @param subject
		 * creating token
		 */ 
	    private String createToken(Map<String, Object> claims, String subject) {

	    }
	    
	    /**
		 * @param token
		 * validating token
		 */ 
	    public Boolean validateToken(String token) {
	    	
	    }
   
}
