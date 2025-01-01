package org.chess.components.pieces.move;

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
}
