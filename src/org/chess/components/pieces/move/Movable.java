package org.chess.components.pieces.move;

import java.awt.Component;

import org.chess.Game;
import org.chess.components.BoardTile;
import org.chess.components.pieces.Checkable;
import org.chess.components.pieces.Piece;

public interface Movable {
	
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
			// Obtain destination location in the board.
			BoardTile dstLocation = Game.chessBoard.boardTiles[destY][destX];
			// Get list of components in that particular tile.
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
	
	public default void showMove(int mY, int mX) {
		int destY = Game.selectedPiece.getCoordY() + mY;
		int destX = Game.selectedPiece.getCoordX() + mX;

		if (evaluateMove(mY,mX) < 3) {
			Game.highlightedPaths.add(Game.chessBoard.boardTiles[destY][destX]);
			Game.chessBoard.boardTiles[destY][destX].highlightTile();
		}
	}
	
	/*
	 * This function is designed to be implemented in all the Piece classes.
	 */
	public void showPosibleMoves();
}
