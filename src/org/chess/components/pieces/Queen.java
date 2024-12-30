package org.chess.components.pieces;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import org.chess.Game;
import org.chess.components.pieces.move.Diagonal;
import org.chess.components.pieces.move.Horizontal;
import org.chess.components.pieces.move.Vertical;

public final class Queen extends Piece implements Horizontal, Vertical, Diagonal {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Queen(int y, int x, String id, Icon ico, Team t) {
		super(y, x, id, t);
		this.setIcon(ico);
		
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if (Game.turn == Queen.super.TEAM) {
					Game.removeOldData();
					
					Game.collectData(Queen.this);
					
					Queen.this.showPosibleMoves();
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
		Horizontal.super.showHorizontalPath(8);
		Vertical.super.showVerticalPath(8);
		Diagonal.super.showDiagonalPath(8);
	}

}
