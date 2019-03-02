/**
 * 
 */
package com.rbs.breach.entity.converter;

import javax.persistence.AttributeConverter;

import com.rbs.breach.entity.Franchise;

/**
 * @author user
 *
 */
public class FranchiseConverter implements AttributeConverter<String, Franchise> {

	@Override
	public Franchise convertToDatabaseColumn(String franchise) {
		return Franchise.codeToObject(franchise);
	}

	@Override
	public String convertToEntityAttribute(Franchise franchise) {
		return Franchise.valueToCode(franchise);
	}

}
