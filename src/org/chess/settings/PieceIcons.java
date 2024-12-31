package org.chess.settings;

import javax.swing.ImageIcon;

/*
 * This class contains constants to each icon in the game.
 */

public class PieceIcons {
	// Base directory for the images.
	public static final String ROOT_DIR			= System.getProperty("user.dir") + "\\src\\org\\chess\\icos\\";
	
	// Icon assignment.
	public static final ImageIcon BLACK_ROOK 	= new ImageIcon(ROOT_DIR + "black_rook.png");
	public static final ImageIcon WHITE_ROOK 	= new ImageIcon(ROOT_DIR + "white_rook.png");
	public static final ImageIcon BLACK_KNIGHT 	= new ImageIcon(ROOT_DIR + "black_knight.png");
	public static final ImageIcon WHITE_KNIGHT 	= new ImageIcon(ROOT_DIR + "white_knight.png");
	public static final ImageIcon BLACK_BISHOP 	= new ImageIcon(ROOT_DIR + "black_bishop.png");
	public static final ImageIcon WHITE_BISHOP 	= new ImageIcon(ROOT_DIR + "white_bishop.png");
	public static final ImageIcon BLACK_QUEEN 	= new ImageIcon(ROOT_DIR + "black_queen.png");
	public static final ImageIcon WHITE_QUEEN 	= new ImageIcon(ROOT_DIR + "white_queen.png");
	public static final ImageIcon BLACK_KING 	= new ImageIcon(ROOT_DIR + "black_king.png");
	public static final ImageIcon WHITE_KING 	= new ImageIcon(ROOT_DIR + "white_king.png");
	public static final ImageIcon BLACK_PAWN 	= new ImageIcon(ROOT_DIR + "black_pawn.png");
	public static final ImageIcon WHITE_PAWN 	= new ImageIcon(ROOT_DIR + "white_pawn.png");
}
