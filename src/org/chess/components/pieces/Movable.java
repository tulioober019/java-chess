package org.chess.components.pieces;

import java.awt.Component;

import org.chess.Game;
import org.chess.components.BoardTile;

public interface Movable {
	public abstract void showPosibleMoves();
	
	public default void showMove(int mY, int mX) {
		int destY = Game.selectedPiece.getCoordY() + mY;
		int destX = Game.selectedPiece.getCoordX() + mX;

		if (evaluateMove(mY,mX) < 3) {
			Game.highlightedPaths.add(Game.chessBoard.boardTiles[destY][destX]);
			Game.chessBoard.boardTiles[destY][destX].highlightTile();
		}
	}
	
	
	public default void showHorizontalMoves() {
		// Print moves on the right.
		for (int pos = 0; pos < 8; pos++) {
			if (evaluateMove(0,pos) < 3) {
				if (evaluateMove(0,pos) == 2) break;
				showMove(0,pos);
				if (evaluateMove(0,pos) == 1) break;
			}
		}
		
		// Print moves on the left.
		for (int pos = 0; pos < 8; pos++) {
			if (evaluateMove(0,-pos) < 3) {
				if (evaluateMove(0,-pos) == 2) break;
				showMove(0,-pos);
				if (evaluateMove(0,-pos) == 1) break;
			}
		}
	}

	public default void showVerticalMoves() {
		for (int pos = 0; pos < 8; pos++) {
			if (evaluateMove(pos,0) < 3) {
				if (evaluateMove(pos,0) == 2) break;
				showMove(pos,0);
				if (evaluateMove(pos,0) == 1) break;
			}
		}
		
		for (int pos = 0; pos < 8; pos++) {
			if (evaluateMove(-pos,0) < 3) {
				if (evaluateMove(-pos,0) == 2) break;
				showMove(-pos,0);
				if (evaluateMove(-pos,0) == 1) break;
			}
		}
	}
	
	public default void showDiagonalMoves() {
		for (int pos = 0; pos < 8; pos++) {
			if (evaluateMove(pos,pos) < 3) {
				if (evaluateMove(pos,pos) == 2) break;
				showMove(pos,pos);
				if (evaluateMove(pos,pos) == 1) break;
			}
		}
		
		for (int pos = 0; pos < 8; pos++) {
			if (evaluateMove(pos,-pos) < 3) {
				if (evaluateMove(pos,-pos) == 2) break;
				showMove(pos,-pos);
				if (evaluateMove(pos,-pos) == 1) break;
			}
		}
		
		for (int pos = 0; pos < 8; pos++) {
			if (evaluateMove(-pos,-pos) < 3) {
				if (evaluateMove(-pos,-pos) == 2) break;
				showMove(-pos,-pos);
				if (evaluateMove(-pos,-pos) == 1) break;
			}
		}
		
		for (int pos = 0; pos < 8; pos++) {
			if (evaluateMove(-pos,pos) < 3) {
				if (evaluateMove(-pos,pos) == 2) break;
				showMove(-pos,pos);
				if (evaluateMove(-pos,pos) == 1) break;
			}
		}
	}
	
	public default void showCircularMoves() {
		showMove(0,0);
		for (int pos = 1; pos < 3; pos++) {
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
	
	public default void showKingMoves() {
		showMove(0,0);
		for (int y = -1; y < 2; y++) {
			for (int x = -1; x < 2; x++) {
				if (evaluateMove(y,x) < 2) showMove(y,x);
			}
		}
	}
	
	public default byte evaluateMove(int mY, int mX) {
		/*
		 * This function returns three codes:
		 * 0: If there is no piece or the same piece is occupying it.
		 * 1: If there is a piece occupying it that is on a different team and is not a king.
		 * 2: If there is any other piece occupying it that is on the same team.
		 * 3: Invalid cell.
		 */
		int destY = Game.selectedPiece.getCoordY() + mY;
		int destX = Game.selectedPiece.getCoordX() + mX;
		
		try {
			BoardTile dstLocation = Game.chessBoard.boardTiles[destY][destX];
			Component[] comps = dstLocation.getComponents();
			Piece targetPiece;
			
			if (comps.length == 0) return 0;
			else {
				targetPiece = (Piece) comps[0];
				if (targetPiece.equals(Game.selectedPiece)) return 0;
				else if ((targetPiece.TEAM != Game.selectedPiece.TEAM) && !(targetPiece instanceof Checkable)) return 1;
				else return 2;
			}
		} catch (ArrayIndexOutOfBoundsException e) { return 3;}
		
	}
}
