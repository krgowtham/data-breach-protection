package com.rbs.breach.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="RISK_PROFILES_DESCISIONS")
@Entity
public class RiskProfiles {
	@Id
	@Column(name="ID")
	private String Id;
	
	private String franchise;
	private String businessArea;
	private String breachCatgeory;
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
