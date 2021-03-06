/**
 * 
 */
package com.rbs.breach.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbs.breach.entity.BreachApplication;
import com.rbs.breach.entity.Franchise;
import com.rbs.breach.entity.enums.RiskProfile;
import com.rbs.breach.repository.BreachApplicationRepository;

/**
 * @author user
 *
 */
@Service
public class BreachService implements IBreachService {

	@Autowired
	BreachApplicationRepository repository;
	
	@Autowired 
	RiskProfileService riskProfileService;

	@Override
	public BreachApplication save(BreachApplication application) {
		String riskProfile = riskProfileService.checkRiskProfileDetails(application.getFranchise(),
				application.getBusinessArea(),
				application.getCategory());
		
		application.setRiskProfile(RiskProfile.valueOf(riskProfile));
		repository.save(application);
		return application;
	}

	public RiskProfile validate(Franchise franchise, String businessArea, String category) {
		return null;
	}
}
