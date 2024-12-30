package org.chess.components.pieces;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;

import org.chess.Game;
import org.chess.components.pieces.move.Circular;

public final class Knight extends Piece implements Circular {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Knight(int y, int x, String id, Icon ico, Team t) {
		super(y, x, id, t);
		this.setIcon(ico);
		
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if (Game.turn == Knight.super.TEAM) {
					Game.removeOldData();
					
					Game.collectData(Knight.this);
					
					Knight.this.showPosibleMoves();
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
		Circular.super.showCircularPath(3);
	}
}
