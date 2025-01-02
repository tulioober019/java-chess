package org.chess.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import org.chess.Game;
import org.chess.components.pieces.Piece;
import org.chess.components.pieces.Pieces;
import org.chess.components.pieces.Team;
import org.chess.exceptions.TeamInCheckException;

public class BoardTile extends JPanel {

	private static final long serialVersionUID = 1L;
	private Color color;
	private boolean isHighlighed = false;
	//private boolean isSelected = false;
	/**
	 * Create the panel.
	 */
	public BoardTile(Color c) {
		this.color = c;
		setBackground(c);
		setSize(new Dimension(75,75));
		
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				int row = Game.chessBoard.getComponentZOrder(BoardTile.this) / 8;
				int col = Game.chessBoard.getComponentZOrder(BoardTile.this) % 8;
				
				for (BoardTile tile: Game.highlightedPaths) {
					if ((row == (Game.chessBoard.getComponentZOrder(tile) / 8)) && (col == Game.chessBoard.getComponentZOrder(tile) % 8) || BoardTile.this.isHighlighted()) {
						// Assign destination coordinates
						Game.destination[0] = (Game.chessBoard.getComponentZOrder(BoardTile.this)) / 8;
						Game.destination[1] = (Game.chessBoard.getComponentZOrder(BoardTile.this)) % 8;
						
						System.out.println("Setting destination coordinates at " + BoardTile.this.parseCoordinates());
						Game.selectedPiece.setCoordinates(row, col);
						
						if (BoardTile.this.getComponents().length > 0) {
							Game.targetPiece = (Piece) (BoardTile.this.getComponents()[0]);
							System.out.println(Game.selectedPiece.getId() + " atacks " + Game.targetPiece.getId() + " at " + Game.targetPiece.parseCoordinates());
							BoardTile.this.remove(BoardTile.this.getComponents()[0]);
						}
						
						BoardTile.this.add(Game.selectedPiece);
						System.out.println(Game.selectedPiece.getId() + " set at " + BoardTile.this.parseCoordinates());
						
						if (Game.turn == Team.WHITE) {
							Game.turn = Team.BLACK; 
							Game.opponent = Team.WHITE;
							System.out.println("It is the black team's turn!");
							if (Pieces.blackKing.listThreats()) {
								System.out.println("Black team in check!");
							}
							
						} else if (Game.turn == Team.BLACK) {
							Game.turn = Team.WHITE; 
							Game.opponent = Team.BLACK;
							System.out.println("It is the white team's turn!");
							if (Pieces.whiteKing.listThreats()) {
								System.out.println("White team in check!");
							}
						}
						
						
						break;
					}
				}
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				for (BoardTile tile: Game.highlightedPaths) {
					tile.unHighlightTile();
				}
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
	
	public void highlightTile() {
		this.isHighlighed = true;
		this.setBackground(Color.CYAN);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	
	public void unHighlightTile() {
		this.isHighlighed = false;
		this.setBackground(color);
		this.setBorder(null);
	}
	
	public Color getDefaultColor() {
		return this.color;
	}
	
	public boolean isHighlighted() {
		return this.isHighlighed;
	}
	
	public String parseCoordinates() {
		String coordinates = "";
		
		switch (Game.destination[0]) {
		case 0:
			coordinates += "8";
			break;
		case 1:
			coordinates += "7";
			break;
		case 2:
			coordinates += "6";
			break;
		case 3:
			coordinates += "5";
			break;
		case 4:
			coordinates += "4";
			break;
		case 5:
			coordinates += "3";
			break;
		case 6:
			coordinates += "2";
			break;
		case 7:
			coordinates += "1";
			break;
		}
		
		switch (Game.destination[1]) {
			case 0:
				coordinates += "a";
				break;
			case 1:
				coordinates += "b";
				break;
			case 2:
				coordinates += "c";
				break;
			case 3:
				coordinates += "d";
				break;
			case 4:
				coordinates += "e";
				break;
			case 5:
				coordinates += "f";
				break;
			case 6:
				coordinates += "g";
				break;
			case 7:
				coordinates += "h";
				break;
		}	
		return coordinates;
	}
	/*private void selectTile() {
		this.isSelected = true;
	}
	
	private void unselectTile() {
		this.isSelected = false;
	}
	
	public boolean isSelected() {
		return this.isSelected;
	}*/
	
}
