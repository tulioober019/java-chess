package org.chess.components.pieces.move;

public interface Diagonal extends Movable {
	
	public default void showDiagonalPath(int n) {
		for (int pos = 0; pos < n; pos++) {
			if (evaluateMove(pos,pos) < 3) {
				if (evaluateMove(pos,pos) == 2) break;
				showMove(pos,pos);
				if (evaluateMove(pos,pos) == 1) break;
			}
		}
		
		for (int pos = 0; pos < n; pos++) {
			if (evaluateMove(pos,-pos) < 3) {
				if (evaluateMove(pos,-pos) == 2) break;
				showMove(pos,-pos);
				if (evaluateMove(pos,-pos) == 1) break;
			}
		}
		
		for (int pos = 0; pos < n; pos++) {
			if (evaluateMove(-pos,-pos) < 3) {
				if (evaluateMove(-pos,-pos) == 2) break;
				showMove(-pos,-pos);
				if (evaluateMove(-pos,-pos) == 1) break;
			}
		}
		
		for (int pos = 0; pos < n; pos++) {
			if (evaluateMove(-pos,pos) < 3) {
				if (evaluateMove(-pos,pos) == 2) break;
				showMove(-pos,pos);
				if (evaluateMove(-pos,pos) == 1) break;
			}
		}
	}
}
