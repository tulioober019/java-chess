package org.chess.components.pieces.move;

import java.util.ArrayList;

public interface PawnSouth extends Movable {
	
	public default void showPath(int n) {
		showMove(0,0);
		
		if (n == 0) {
			for (int pos = 1; pos <= 2; pos++) {
				if (evaluateMove(pos,0) < 1) showMove(pos,0);
			}
		} else {
			for (int pos = 1; pos <= 1; pos++) {
				if (evaluateMove(pos,0) < 1) showMove(pos,0);
			}
		}
		if (evaluateMove(1,1) == 1) showMove(1,1);
		if (evaluateMove(1,-1) == 1) showMove(1,-1);
	}

	public default ArrayList<int[]> getPawnSouthPotentialMoves() {
		ArrayList<int[]> potentialMoves = new ArrayList<int[]>();
		if (evaluateMove(1,1) == 1) potentialMoves.add(new int[] {1,1});
		if (evaluateMove(1,-1) == 1) potentialMoves.add(new int[] {-1,1});
		return potentialMoves;
	}
}
