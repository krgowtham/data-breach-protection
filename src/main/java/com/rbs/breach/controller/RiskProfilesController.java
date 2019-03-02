package com.rbs.breach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rbs.breach.entity.enums.RiskProfile;


@RestController
public class RiskProfilesController {
	

	
	@GetMapping("/findRiskProfile")
	public String getRiskProfile(@RequestBody RiskProfile profiles){
		
		return null;
	}
}
