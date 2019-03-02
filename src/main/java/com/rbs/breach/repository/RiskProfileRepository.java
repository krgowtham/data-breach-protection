package com.rbs.breach.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rbs.breach.entity.RiskProfiles;

@Repository
public interface RiskProfileRepository extends CrudRepository<RiskProfiles, Long> {

	
}
