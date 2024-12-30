package org.chess.components.pieces;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import org.chess.Game;
import org.chess.components.pieces.move.PawnSouth;
import org.chess.settings.PieceIcons;

public final class BlackPawn extends Piece implements PawnSouth {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BlackPawn(int y, int x, String id) {
		super(y, x, id, Team.BLACK);
		// TODO Auto-generated constructor stub
		this.setIcon(PieceIcons.BLACK_PAWN);
		
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if (Game.turn == Team.BLACK) {
					// Removes the old path if the user hasn't selected any chess piece.
					Game.removeOldData();
					
					// Collect information.
					Game.collectData(BlackPawn.this);
					
					// Highlight piece
					BlackPawn.this.showPosibleMoves();
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
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	
	@Override
	public void showPosibleMoves() {
		PawnSouth.super.showPath(counter);
	}
	
}
