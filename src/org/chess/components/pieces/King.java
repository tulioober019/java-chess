package org.chess.components.pieces;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import org.chess.Game;
import org.chess.components.BoardTile;
import org.chess.components.pieces.move.Circular;
import org.chess.components.pieces.move.Diagonal;
import org.chess.components.pieces.move.Horizontal;
import org.chess.components.pieces.move.Vertical;

public final class King extends Piece implements Horizontal, Vertical, Diagonal, Checkable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public King(int y, int x, String id, Icon ico, Team t) {
		super(y, x, id, t);
		this.setIcon(ico);

		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if (Game.turn == King.super.TEAM) {
					Game.removeOldData();

					Game.collectData(King.this);

					King.this.showPosibleMoves();
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
		showHorizontalPath(2);
		showVerticalPath(2);
		showDiagonalPath(2);
	}

	@Override
	public byte evaluateMove(int mY, int mX, Piece threat) {
		int destY = threat.getCoordY() + mY;
		int destX = threat.getCoordX() + mX;

		try {
			BoardTile dstLocation = Game.chessBoard.boardTiles[destY][destX];
			Component[] comps = dstLocation.getComponents();
			//Piece target;

			if (comps.length == 0) return 0;
			else {
				//target = (Piece) comps[0];
				//if (target.equals(threat)) return 0;
				if ((King.this.TEAM != threat.TEAM) && !(threat instanceof Checkable)) return 1;
				else return 2;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			return 3;
		}
	}

	@Override
	public boolean listThreats() {
		if (!Game.teamThreat.isEmpty()) {
			Game.teamThreat.clear();
		}

		for (Piece character : Game.getAllPotencialThreats(Game.opponent)) {
			if (character instanceof WhitePawn) {
				if (!(((WhitePawn) character).getPawnNorthPotentialMoves().isEmpty())) {
					Game.teamThreat.add(character);
				}
			} else if (character instanceof BlackPawn) {
				if (!(((BlackPawn) character).getPawnSouthPotentialMoves().isEmpty())) {
					Game.teamThreat.add(character);
				}
			}
		}
		return !(Game.teamThreat.isEmpty());
	}
}
