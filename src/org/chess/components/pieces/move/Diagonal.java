package org.chess.components.pieces.move;

import java.util.ArrayList;

public interface Diagonal extends Movable {
	
	public default void showDiagonalPath(int n) {
		for (int pos = 0; pos < n; pos++) {
			if (evaluateMove(pos,pos) < 4) {
				if (evaluateMove(pos,pos) >= 2) break;
				showMove(pos,pos);
				if (evaluateMove(pos,pos) == 1) break;
			}
		}
		
		for (int pos = 0; pos < n; pos++) {
			if (evaluateMove(pos,-pos) < 4) {
				if (evaluateMove(pos,-pos) >= 2) break;
				showMove(pos,-pos);
				if (evaluateMove(pos,-pos) == 1) break;
			}
		}
		
		for (int pos = 0; pos < n; pos++) {
			if (evaluateMove(-pos,-pos) < 4) {
				if (evaluateMove(-pos,-pos) >= 2) break;
				showMove(-pos,-pos);
				if (evaluateMove(-pos,-pos) == 1) break;
			}
		}
		
		for (int pos = 0; pos < n; pos++) {
			if (evaluateMove(-pos,pos) < 4) {
				if (evaluateMove(-pos,pos) >= 2) break;
				showMove(-pos,pos);
				if (evaluateMove(-pos,pos) == 1) break;
			}
		}
	}

	public default ArrayList<int[]> getDiagonalPotentialMoves() {
		ArrayList<int[]> potentialMoves = new ArrayList<>();
		for (int pos = 0; pos < 8; pos++) {
			if (evaluateMove(pos,pos) < 4) {
				if (evaluateMove(pos,pos) > 2 || evaluateMove(pos,pos) == 1) break;
				if (evaluateMove(pos,pos) == 2) {
					potentialMoves.add(new int[] {pos,pos});
					break;
				}
			}
		}

		for (int pos = 0; pos < 8; pos++) {
			if (evaluateMove(-pos,pos) < 4) {
				if (evaluateMove(-pos,pos) > 2 || evaluateMove(-pos,pos) == 1) break;
				if (evaluateMove(-pos,pos) == 2) {
					potentialMoves.add(new int[] {-pos,pos});
					break;
				}
			}
		}

		for (int pos = 0; pos < 8; pos++) {
			if (evaluateMove(pos,-pos) < 4) {
				if (evaluateMove(pos,-pos) > 2 || evaluateMove(pos,-pos) == 1) break;
				if (evaluateMove(pos,-pos) == 2) {
					potentialMoves.add(new int[] {pos,-pos});
					break;
				}
			}
		}

		for (int pos = 0; pos < 8; pos++) {
			if (evaluateMove(-pos,-pos) < 4) {
				if (evaluateMove(-pos,-pos) > 2 || evaluateMove(-pos,-pos) == 1) break;
				if (evaluateMove(-pos,-pos) == 2) {
					potentialMoves.add(new int[] {-pos,-pos});
					break;
				}
			}
		}
		return potentialMoves;
	}
}
