package com.rbs.breach.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rbs.breach.entity.Franchise;
import com.rbs.breach.entity.RiskProfiles;

@Repository
public interface RiskProfileRepository extends CrudRepository<RiskProfiles, Long> {

	RiskProfiles findByFranchiseAndBusinessAreaAndBreachCatgeory(Franchise franchise, String businessArea,
			String breachCategory);

}
