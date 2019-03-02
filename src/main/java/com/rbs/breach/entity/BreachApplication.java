/**
 * 
 */
package com.rbs.breach.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.rbs.breach.entity.converter.FranchiseConverter;
import com.rbs.breach.entity.enums.RiskProfile;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author user
 *
 */
@Entity
@NoArgsConstructor @Getter @Setter
public class BreachApplication {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Convert(converter = FranchiseConverter.class)
	@Enumerated(EnumType.STRING)
	@Column
	private Franchise franchise;
	
	@Column
	private String businessArea;
	
	@Column
	private String identifiedBy;
	
	@Column
	private String colleagueFullName;
	
	@Column
	private String isSupplier;
	
	@Column
	private String reportPerson;
	
	@Column
	private String companyName;
	
	@Column
	private String reportPersonContact;
	
	@Column
	private Date awareDate;
	
	@Column
	private Date breachDate;
	
	@Column
	private char awareBefore;
	
	@Column
	private String awareDetails;
	
	@Column
	private String category;
	
	@Column
	private char faxSent;
	
	@Column
	private char isMisplaced;
	
	@Column
	private String detailsAboutBreach;
	
	@Column
	private char causeInBusinessArea;
	
	@Column
	private String causedFranchise;
	
	@Column
	private String causedBusiness;
	
	@Column
	private String impactedAccounts;
	
	@Column
	private String customerName;
	
	@Column
	private String typeOfInformation;

	@Column
	private RiskProfile riskProfile;

}
