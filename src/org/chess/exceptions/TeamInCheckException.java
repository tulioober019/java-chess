package org.chess.exceptions;

public class TeamInCheckException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TeamInCheckException(Throwable cause) {
		super("Your team is in check. Only your king is movable. 😭", cause);
	}
}
