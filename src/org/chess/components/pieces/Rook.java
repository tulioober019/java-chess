package org.chess.components.pieces;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import org.chess.Game;
import org.chess.components.pieces.move.Horizontal;
import org.chess.components.pieces.move.Vertical;

public final class Rook extends Piece implements Horizontal, Vertical {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Rook(int y, int x, String id, Icon ico, Team t) {
		super(y, x, id, t);
		this.setIcon(ico);
		
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if (Game.turn == Rook.super.TEAM) {
					Game.removeOldData();
					
					Game.collectData(Rook.this);
					
					Rook.this.showPosibleMoves();
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
//		showHorizontalMoves();
//		showVerticalMoves();
		Horizontal.super.showHorizontalPath(8);
		Vertical.super.showVerticalPath(8);
	}
}
