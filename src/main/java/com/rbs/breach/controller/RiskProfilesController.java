package com.rbs.breach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rbs.breach.entity.Franchise;
import com.rbs.breach.entity.enums.RiskProfile;
import com.rbs.breach.service.RiskProfileService;


@RestController
public class RiskProfilesController {
	

	@Autowired 
	RiskProfileService riskProfileService;
	
	@GetMapping("/findRiskProfile")
	public String getRiskProfile(Franchise franchise, String businessArea,String breachCategory){
		
		String profileStatus = riskProfileService.checkRiskProfileDetails(franchise, businessArea, breachCategory);
		return profileStatus;
	}
}
