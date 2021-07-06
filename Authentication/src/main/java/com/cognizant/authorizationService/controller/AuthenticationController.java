package com.cognizant.authorizationService.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.authorizationService.exception.BadCredentialException;
import com.cognizant.authorizationService.exception.LoginException;
import com.cognizant.authorizationService.model.AuthenticationRequest;
import com.cognizant.authorizationService.model.AuthenticationResponse;
import com.cognizant.authorizationService.service.JwtUtil;
import com.cognizant.authorizationService.service.MyUserDetailsService;
import com.cognizant.authorizationService.service.ValidateService;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "*")
@RestController
@Slf4j
/**
 * 
 * This class all the end points for JwtAuthentication
 * Microservice has mapping as :-
 * postmapping-createAuthenticationToken()
 * getmapping-getValidity()
 * 
 */
public class AuthenticationController {
	
	Logger logger = LoggerFactory.getLogger(AuthenticationController.class);
	
	AuthenticationController (){
	}
	
	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtUtil jwtTokenUtil;

	@Autowired
	private MyUserDetailsService userDetailsService;

	@Autowired
	private ValidateService validateService;

	/**
	 * @param authenticationRequest
	 * After validation of username and password it will generate the token
	 * if incorrect userdetails then it will through loginException
	 * 
	 */
	@PostMapping("/login")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest)
			throws BadCredentialException, LoginException {

		
	}
	
	/**
	 * @param token - to validate the token
	 * Sending the request header as "Authorization"
	 * returns the validity of token
	 */
	@GetMapping("/validate")
	public AuthenticationResponse getValidity(@RequestHeader("Authorization") final String token) {
		return null;
	}

}
