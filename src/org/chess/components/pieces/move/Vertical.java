package org.chess.components.pieces.move;

public interface Vertical extends Movable {
	
	public default void showVerticalPath(int n) {
		for (int pos = 0; pos < n; pos++) {
			if (evaluateMove(pos,0) < 3) {
				if (evaluateMove(pos,0) == 2) break;
				showMove(pos,0);
				if (evaluateMove(pos,0) == 1) break;
			}
		}
		
		for (int pos = 0; pos < n; pos++) {
			if (evaluateMove(-pos,0) < 3) {
				if (evaluateMove(-pos,0) == 2) break;
				showMove(-pos,0);
				if (evaluateMove(-pos,0) == 1) break;
			}
		}
	}
}
