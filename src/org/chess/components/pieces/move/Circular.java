package org.chess.components.pieces.move;

import java.lang.reflect.Array;
import java.util.ArrayList;

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

	public default ArrayList<int[]> getCircularPotentialMoves() {
		ArrayList<int[]> potentialMoves = new ArrayList<int[]>();
		for (int pos = 1; pos < 3; pos++) {
			if (pos == 1) {
				if (evaluateMove(-pos,-(pos+1)) == 2) potentialMoves.add(new int[] {-pos,-(pos+1)});
				if (evaluateMove(-pos,(pos+1)) == 2) potentialMoves.add(new int[] {-pos,(pos+1)});
				if (evaluateMove(pos,-(pos+1)) == 2) potentialMoves.add(new int[] {pos,-(pos+1)});
				if (evaluateMove(pos,(pos+1)) == 2) potentialMoves.add(new int[] {pos,(pos+1)});
			}

			if (pos == 2) {
				if (evaluateMove(-pos,-(pos-1)) == 2) potentialMoves.add(new int[] {-pos,-(pos-1)});
				if (evaluateMove(-pos,(pos-1)) == 2) potentialMoves.add(new int[] {-pos,(pos-1)});
				if (evaluateMove(pos,-(pos-1)) == 2) potentialMoves.add(new int[] {pos,-(pos-1)});
				if (evaluateMove(pos,(pos-1)) == 2) potentialMoves.add(new int[] {pos,(pos-1)});
			}
		}
		return potentialMoves;
	}
}
