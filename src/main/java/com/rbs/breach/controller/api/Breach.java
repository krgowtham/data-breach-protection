package com.rbs.breach.controller.api;

import java.sql.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Breach {
	private String franchise;
	private String businessArea;
	private String identifiedBy;
	private String colleagueFullName;
	private String isSupplier;
	private String reportPerson;
	private String companyName;
	private String reportPersonContact;
	private Date awareDate;
	private Date breachDate;
	private char awareBefore;
	private String awareDetails;
	private String category;
	private char faxSent;
	private char isMisplaced;
	private String detailsAboutBreach;
	private char causeInBusinessArea;
	private String causedFranchise;
	private String causedBusiness;
	private List<String> impactedAccounts;
	private String customerName;
	private String typeOfInformation;
	private String riskProfile;
}
