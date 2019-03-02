/**
 * 
 */
package com.rbs.breach.exception;

/**
 * @author user
 *
 */
public class InvalidFranchiseException extends RuntimeException {

	private static final long serialVersionUID = 6717436949227259828L;

	public InvalidFranchiseException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidFranchiseException(String message) {
		super(message);
	}

}
