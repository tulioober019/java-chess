package org.chess.components.pieces;

public interface Checkable {
	
	public byte evaluateMove(int mY, int mX, Piece threat);
	public boolean listThreats();
	//public boolean isInCheck();
}
