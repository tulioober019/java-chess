package org.chess.exceptions;

public class TeamInCheckException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TeamInCheckException(Throwable cause) {
		super("Your team is already in check. Only the queen is movable", cause);
	}
}
