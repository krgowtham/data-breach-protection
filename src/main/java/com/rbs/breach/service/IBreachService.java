package com.rbs.breach.service;

import com.rbs.breach.entity.BreachApplication;
import com.rbs.breach.entity.Franchise;
import com.rbs.breach.entity.enums.RiskProfile;

public interface IBreachService {

	RiskProfile validate(Franchise franchise, String businessArea, String category);
	
	BreachApplication save(BreachApplication application);
}
