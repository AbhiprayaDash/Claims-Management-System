package com.cognizant.policy.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name="provider_policy")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ProviderPolicy {
	
	@Id
	
	public int providerId;
	
	public String providerName;
	
	public String providerAddress;
	
	public int policyId;
	
	public String location;
}
