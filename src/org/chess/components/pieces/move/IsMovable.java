package org.chess.components.pieces.move;

import java.awt.Component;

import org.chess.Game;
import org.chess.components.BoardTile;
import org.chess.components.pieces.Checkable;
import org.chess.components.pieces.Piece;

public interface IsMovable {
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
