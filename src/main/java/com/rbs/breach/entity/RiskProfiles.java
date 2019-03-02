package com.rbs.breach.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @Getter @Setter
@Table(name = "RISK_PROFILES_DESCISIONS")
@Entity
public class RiskProfiles {
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private String Id;
	
	@Column(name = "FRANCHISE")
	private String franchise;
	
	@Column(name = "BUSINESS_AREA")
	private String businessArea;
	
	@Column(name = "BREACH_CATEGORY")
	private String breachCatgeory;

	@Column(name = "RISK_STATUS")
	private String riskStatus;

}
