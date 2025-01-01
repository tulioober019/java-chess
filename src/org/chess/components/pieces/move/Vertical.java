package org.chess.components.pieces.move;

import java.util.ArrayList;

public interface Vertical extends Movable {
	
	public default void showVerticalPath(int n) {
		for (int pos = 0; pos < n; pos++) {
			if (evaluateMove(pos,0) < 4) {
				if (evaluateMove(pos,0) >= 2) break;
				showMove(pos,0);
				if (evaluateMove(pos,0) == 1) break;
			}
		}
		
		for (int pos = 0; pos < n; pos++) {
			if (evaluateMove(-pos,0) < 4) {
				if (evaluateMove(-pos,0) >= 2) break;
				showMove(-pos,0);
				if (evaluateMove(-pos,0) == 1) break;
			}
		}
	}

	public default ArrayList<int[]> getVerticalPotentialMoves() {
		ArrayList<int[]> potentialMoves = new ArrayList<int[]>();
		for (int pos = 0; pos < 8; pos++) {
			if (evaluateMove(pos,0) < 4) {
				if (evaluateMove(pos,0) > 2 || evaluateMove(pos,0) < 2) break;
				if (evaluateMove(pos,0) == 2) {
					potentialMoves.add(new int[] {pos,0});
					break;
				}
			}
		}

		for (int pos = 0; pos < 8; pos++) {
			if (evaluateMove(-pos,0) < 4) {
				if (evaluateMove(-pos,0) > 2 || evaluateMove(-pos,0) < 2) break;
				if (evaluateMove(-pos,0) == 2) {
					potentialMoves.add(new int[] {-pos,0});
					break;
				}
			}
		}
		return potentialMoves;
	}
}
