package com.rbs.breach.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="RISK_PROFILES_DESCISIONS")
@Entity
public class RiskProfiles {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private String Id;
	@Column(name="FRANCHISE")
	private String franchise;
	@Column(name="BUSINESS_AREA")
	private String businessArea;
	@Column(name="BREACH_CATEGORY")
	private String breachCatgeory;
	@Column(name="RISK_STATUS")
	private String riskStatus;
	public String getFranchise() {
		return franchise;
	}
	public void setFranchise(String franchise) {
		this.franchise = franchise;
	}
	public String getBusinessArea() {
		return businessArea;
	}
	public void setBusinessArea(String businessArea) {
		this.businessArea = businessArea;
	}
	public String getBreachCatgeory() {
		return breachCatgeory;
	}
	public void setBreachCatgeory(String breachCatgeory) {
		this.breachCatgeory = breachCatgeory;
	}
	public String getRiskStatus() {
		return riskStatus;
	}
	public void setRiskStatus(String riskStatus) {
		this.riskStatus = riskStatus;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	

}
