package com.cognizant.policy.controller;

import java.util.List;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cognizant.policy.model.MemberPolicy;
import com.cognizant.policy.model.ProviderPolicy;
import com.cognizant.policy.repository.PolicyRepo;
import com.cognizant.policy.model.Benefits;


public class PolicyMicroserviceController 
{
	@Autowired
	PolicyRepo providerRepo;
	@Autowired
	PolicyRepo memberPolicyRepo;
	
	
	@GetMapping(value = "getChainOfProviders/{policyId}")
	public ResponseEntity<?> getChainOfProviders(@PathVariable("policyId") int policyId,
			@RequestHeader(name = "Authorization", required = true) String token)
	{
		List<ProviderPolicy> providers = providerRepo.findAllByPolicyIdOrderByLocation(policyId);
	}
	
	
	@GetMapping(value = "getEligibleBenefits/{policyId}/{memberId}")
	public ResponseEntity<?> getEligibleBenefits(@PathVariable("policyId") int policyId,
			@PathVariable("memberId") int memberId) 
	{
		return new ResponseEntity<>(benefitDetails, HttpStatus.OK);
	}

	@GetMapping(value = "/getClaimAmount/{policyId}/{memberId}/{benefitId}")
	public ResponseEntity<?> getEligibleClaimAmount(@PathVariable int policyId, @PathVariable int memberId,
			@PathVariable int benefitId)
	{
		MemberPolicy mempolicy = memberPolicyRepo.findCapAmount(policyId, memberId, benefitId);
		return new ResponseEntity<Double>(mempolicy.getCapAmountBenefits(), HttpStatus.OK);
	}
}
