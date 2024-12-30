package org.chess.components.pieces.move;

public interface PawnNorth extends Movable {

	public default void showPath(int n) {
		showMove(0,0);
		if (n == 0) {
			for (int pos = 1; pos <= 2; pos++) {
				if (evaluateMove(-pos,0) < 1) showMove(-pos,0);
			}
		} else {
			for (int pos = 1; pos <= 1; pos++) {
				if (evaluateMove(-pos,0) < 1) showMove(-pos,0);
			}
		}
		if (evaluateMove(-1,1) == 1) showMove(-1,1);
		if (evaluateMove(-1,-1) == 1) showMove(-1,-1);
	}
}
