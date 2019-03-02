package com.rbs.breach;

import java.util.ArrayList;
import java.util.Iterator;
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
		List<String> riskProfileList = new ArrayList<String>();
		riskProfileList.add("Private banking|Customer Experience|Loss of device/physical files |HIGH");
		riskProfileList.add("Private banking|Customer Experience|PIN/Card Issues |HIGH");
		riskProfileList.add("RBSI|Customer Experience|Loss of device/physical files |HIGH");
		riskProfileList.add("RBSI|Customer Experience|PIN/Card Issues |HIGH");
		riskProfileList.add("RBSI|Risk|PIN/Card Issues|HIGH");
		riskProfileList.add("RBSI|Finance|Loss of device/physical files |HIGH");
		riskProfileList.add("Services|Information found by a third party /member of publis becuase it was left in an insecure|HIGH");
		riskProfileList.add("Services|Payments|Loss of device/physical files |HIGH");
		riskProfileList.add("Services|Payments|PIN/Card Issues|MEDIUM");
		riskProfileList.add("RBSI|Personal and Business Banking||MEDIUM");
		riskProfileList.add("Private banking|Business Banking|Loss of device/physical files |MEDIUM");
		Iterator it = riskProfiles.iterator();
		while(it.hasNext()){
			String eachrisk = (String)it.next();
			String arr[] = eachrisk.split("|");
			RiskProfiles riskProfiels = new RiskProfiles();
			riskProfiels.setFranchise(arr[0]);
			riskProfiels.setFranchise(arr[1]);
			riskProfiels.setFranchise(arr[2]);
			riskProfiels.setFranchise(arr[3]);
			riskProfiles.add(riskProfiels);
		}
		
		riskProfileRepository.saveAll(riskProfiles);
	}
}
