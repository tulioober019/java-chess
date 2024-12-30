package org.chess.components.pieces;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import org.chess.Game;
import org.chess.components.pieces.move.PawnNorth;
import org.chess.settings.PieceIcons;

public final class WhitePawn extends Piece implements PawnNorth, Promotable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public WhitePawn(int y, int x, String id) {
		super(y, x, id, Team.WHITE);
		this.setIcon(PieceIcons.WHITE_PAWN);
		
		this.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (Game.turn == Team.WHITE) {
					// Removes the old path if the user hasn't selected any chess piece.
					Game.removeOldData();
					
					// Collect information.
					Game.collectData(WhitePawn.this);
					
					// Highlight piece
					WhitePawn.this.showPosibleMoves();
				}
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
	}
	
	@Override 
	public void showPosibleMoves() {
		PawnNorth.super.showPath(counter);
	}

	@Override
	public void promote() {
		// TODO Auto-generated method stub
		new org.chess.functions.PromotePawn();
	}
	
}
