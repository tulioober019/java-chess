package org.chess.components.pieces;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;

import org.chess.Game;
import org.chess.components.pieces.move.Diagonal;

public final class Bishop extends Piece implements Diagonal {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Bishop(int y, int x, String id, Icon ico, Team t) {
		super(y, x, id, t);
		this.setIcon(ico);
		
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if (Game.turn == Bishop.super.TEAM) {
					Game.removeOldData();
					
					Game.collectData(Bishop.this);
					
					Bishop.this.showPosibleMoves();
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
		// TODO Auto-generated method stub
		Diagonal.super.showDiagonalPath(8);
	}

}
