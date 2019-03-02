package com.rbs.breach.entity;

import com.rbs.breach.exception.InvalidFranchiseException;

public enum Franchise {

	PRIVATE_BANKING("Private Banking"),
	RBSI("RBSI"),
	SERVICES("Services");
	
	private final String value;

    private Franchise(String value) {
        this.value = value;
    }
    
    public String getValue() {
		return value;
	}

	public static Franchise codeToObject(String franchise) {
		switch (franchise) {
		case "Private Banking":
			return PRIVATE_BANKING;
		case "RBSI":
			return RBSI;
		case "Services":
			return Franchise.SERVICES;
			default:
				throw new InvalidFranchiseException("Not a valid Franchise");
		}
	}

	public static String valueToCode(Franchise franchise) {
		return franchise.getValue();
	}
}
