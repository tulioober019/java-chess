package org.chess.components.pieces.move;

public interface Circular extends Movable {
	
	public default void showCircularPath(int n) {
		n = 3;
		showMove(0,0);
		for (int pos = 1; pos < n; pos++) {
			if (pos == 1) {
				if (evaluateMove(-pos,-(pos+1)) < 2) showMove(-pos,-(pos+1));
				if (evaluateMove(-pos,(pos+1)) < 2) showMove(-pos,(pos+1));
				if (evaluateMove(pos,-(pos+1)) < 2) showMove(pos,-(pos+1));
				if (evaluateMove(pos,(pos+1)) < 2) showMove(pos,(pos+1));
			}
			
			if (pos == 2) {
				if (evaluateMove(-pos,-(pos-1)) < 2) showMove(-pos,-(pos-1));
				if (evaluateMove(-pos,(pos-1)) < 2) showMove(-pos,(pos-1));
				if (evaluateMove(pos,-(pos-1)) < 2) showMove(pos,-(pos-1));
				if (evaluateMove(pos,(pos-1)) < 2) showMove(pos,(pos-1));
			}
		}
	}
}
