package com.rbs.breach;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.rbs.breach.entity.RiskProfiles;
import com.rbs.breach.repository.RiskProfileRepository;

@SpringBootApplication
public class BreachDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(BreachDataApplication.class, args);
	}

	RiskProfileRepository riskProfileRepository;
	
	@EventListener(ApplicationReadyEvent.class)
	public void doPopulateRiskProfileValuesToDB() {
		
		List<RiskProfiles> riskProfiles = new ArrayList<>();
		//TODO: Create each RiskProfile
		
		
		riskProfileRepository.saveAll(riskProfiles);
	}
}
