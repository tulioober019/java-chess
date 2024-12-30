package org.chess.components.pieces;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Piece extends JLabel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int coord_x;
	int coord_y;
	String id;
	int counter;
	public Team TEAM;
	boolean atacked;
	
	public Piece(int y, int x, String id, Team t) {
		//this.setCoordinates(y, x);
		this.TEAM = t;
		this.coord_y = y;
		this.coord_x = x;
		this.setHorizontalAlignment(SwingConstants.CENTER);
		this.setVerticalAlignment(SwingConstants.CENTER);
		this.id = id;
	}
	
	public void setCoordinates(int y, int x) {
		this.coord_y = y;
		this.coord_x = x;
		this.counter++;
	}
	
	public int getCoordX() {
		return this.coord_x;
	}
	
	public int getCoordY() {
		return this.coord_y;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setAtacked() { this.atacked = true;}
	
	public String parseCoordinates() {
		String coordinates = "";
		
		switch (this.coord_y) {
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
		
		switch (this.coord_x) {
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
}
