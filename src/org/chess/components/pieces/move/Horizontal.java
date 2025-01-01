package org.chess.components.pieces.move;

import java.util.ArrayList;

public interface Horizontal extends Movable {
	
	//@Override
	public default void showHorizontalPath(int n) {
		// Print moves on the right.
		for (int pos = 0; pos < n; pos++) {
			if (evaluateMove(0,pos) < 4) {
				if (evaluateMove(0,pos) >= 2) break;
				showMove(0,pos);
				if (evaluateMove(0,pos) == 1) break;
			}
		}
		
		// Print moves on the left.
		for (int pos = 0; pos < n; pos++) {
			if (evaluateMove(0,-pos) < 4) {
				if (evaluateMove(0,-pos) >= 2) break;
				showMove(0,-pos);
				if (evaluateMove(0,-pos) == 1) break;
			}
		}
	}

	public default ArrayList<int[]> getHorizontalPotentialMoves() {
		ArrayList<int[]> potentialMoves = new ArrayList<int[]>();
		for (int pos = 0; pos < 8; pos++) {
			if (evaluateMove(0,pos) < 4) {
				if (evaluateMove(0,pos) > 2 || evaluateMove(0,pos) < 2) break;
				if (evaluateMove(0,pos) == 2) {
					potentialMoves.add(new int[] {0,pos});
					break;
				}
			}
		}

		for (int pos = 0; pos < 8; pos++) {
			if (evaluateMove(0,-pos) < 4) {
				if (evaluateMove(0,-pos) > 2 || evaluateMove(0,-pos) < 2) break;
				if (evaluateMove(0,-pos) == 2) {
					potentialMoves.add(new int[] {0,-pos});
					break;
				}
			}
		}

		return potentialMoves;
	}
}
