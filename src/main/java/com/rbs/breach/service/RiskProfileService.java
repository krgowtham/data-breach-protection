package com.rbs.breach.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbs.breach.entity.Franchise;
import com.rbs.breach.entity.RiskProfiles;
import com.rbs.breach.repository.RiskProfileRepository;

@Service
public class RiskProfileService {
	
	@Autowired
	RiskProfileRepository profileRepository;

	public List<String> getRiskProfileList(){
		
		List<String> riskProfileList = new ArrayList<String>();
		riskProfileList.add("Private banking|Customer Experience|Loss of device/physical files |High");
		riskProfileList.add("Private banking|Customer Experience|PIN/Card Issues |High");
		riskProfileList.add("RBSI|Customer Experience|Loss of device/physical files |High");
		riskProfileList.add("RBSI|Customer Experience|PIN/Card Issues |High");
		riskProfileList.add("RBSI|Risk|PIN/Card Issues|High");
		riskProfileList.add("RBSI|Finance|Loss of device/physical files |High");
		riskProfileList.add("Services|Information found by a third party /member of publis becuase it was left in an insecure|High");
		riskProfileList.add("Services|Payments|Loss of device/physical files |High");
		riskProfileList.add("Services|Payments|PIN/Card Issues|Medium");
		riskProfileList.add("RBSI|Personal and Business Banking||Medium");
		riskProfileList.add("Private banking|Business Banking|Loss of device/physical files |Medium");
		
		return riskProfileList;
		
	}
	
	public String checkRiskProfileDetails(String franchise,String businessArea, String breachCategory){
		List<String> riskProfileList = this.getRiskProfileList();
		Iterator<String> it = riskProfileList.iterator();
		
		while(it.hasNext()){
			List tempList = new ArrayList();
			String resultData = (String)it.next();
			String values[] = resultData.split("|");
			tempList = Arrays.asList(values);
			if(tempList.contains(franchise)&& tempList.contains(businessArea) && tempList.contains(breachCategory)){
				return (String) tempList.get(3);
			}
		}
		return "";
	}
	
	public String checkRiskProfileDetails(Franchise franchise, String businessArea, String breachCategory){
		RiskProfiles riskProfile = profileRepository.findByFranchiseAndBusinessAreaAndBreachCatgeory(franchise, businessArea, breachCategory);
		return riskProfile.getRiskStatus();
	}
}
