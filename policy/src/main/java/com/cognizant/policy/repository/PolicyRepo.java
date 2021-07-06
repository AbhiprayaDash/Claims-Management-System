package com.cognizant.policy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.policy.model.Policy;

@Repository
public class PolicyRepo extends JpaRepository<Policy,Integer> {

}
