package org.chess.components.pieces;

import org.chess.settings.PieceIcons;

public class Pieces {
	// Spawn White pawns
	public static WhitePawn whitePawn1 = new WhitePawn(6,0,"white_pawn_1");
	public static WhitePawn whitePawn2 = new WhitePawn(6,1,"white_pawn_2");
	public static WhitePawn whitePawn3 = new WhitePawn(6,2,"white_pawn_3");
	public static WhitePawn whitePawn4 = new WhitePawn(6,3,"white_pawn_4");
	public static WhitePawn whitePawn5 = new WhitePawn(6,4,"white_pawn_5");
	public static WhitePawn whitePawn6 = new WhitePawn(6,5,"white_pawn_6");
	public static WhitePawn whitePawn7 = new WhitePawn(6,6,"white_pawn_7");
	public static WhitePawn whitePawn8 = new WhitePawn(6,7,"white_pawn_8");
	
	// Spawn Black pawns
	public static BlackPawn blackPawn1 = new BlackPawn(1,0,"black_pawn_1");
	public static BlackPawn blackPawn2 = new BlackPawn(1,1,"black_pawn_2");
	public static BlackPawn blackPawn3 = new BlackPawn(1,2,"black_pawn_3");
	public static BlackPawn blackPawn4 = new BlackPawn(1,3,"black_pawn_4");
	public static BlackPawn blackPawn5 = new BlackPawn(1,4,"black_pawn_5");
	public static BlackPawn blackPawn6 = new BlackPawn(1,5,"black_pawn_6");
	public static BlackPawn blackPawn7 = new BlackPawn(1,6,"black_pawn_7");
	public static BlackPawn blackPawn8 = new BlackPawn(1,7,"black_pawn_8");
	
	// Spawn White rooks
	public static Rook whiteRook1 = new Rook(7,0,"white_rook_1",PieceIcons.WHITE_ROOK, Team.WHITE);
	public static Rook whiteRook2 = new Rook(7,7,"white_rook_2",PieceIcons.WHITE_ROOK, Team.WHITE);
	
	// Spawn Black rooks.
	public static Rook blackRook1 = new Rook(0,0,"black_rook_1",PieceIcons.BLACK_ROOK, Team.BLACK);
	public static Rook blackRook2 = new Rook(0,7,"black_rook_2",PieceIcons.BLACK_ROOK, Team.BLACK);
	
	// Spawn White knights.
	public static Knight whiteKnight1 = new Knight(7,1,"white_knight_1",PieceIcons.WHITE_KNIGHT, Team.WHITE);
	public static Knight whiteKnight2 = new Knight(7,6,"white_knight_2",PieceIcons.WHITE_KNIGHT, Team.WHITE);
	
	// Spawn Black knights.
	public static Knight blackKnight1 = new Knight(0,1,"black_knight_1",PieceIcons.BLACK_KNIGHT, Team.BLACK);
	public static Knight blackKnight2 = new Knight(0,6,"black_knight_2",PieceIcons.BLACK_KNIGHT, Team.BLACK);
	
	// Spawn White Bishop.
	public static Bishop whiteBishop1 = new Bishop(7,2,"white_bishop_1",PieceIcons.WHITE_BISHOP, Team.WHITE);
	public static Bishop whiteBishop2 = new Bishop(7,5,"white_bishop_2",PieceIcons.WHITE_BISHOP, Team.WHITE);

	// Spawn Black Bishop.
	public static Bishop blackBishop1 = new Bishop(0,2,"white_bishop_1",PieceIcons.BLACK_BISHOP, Team.BLACK);
	public static Bishop blackBishop2 = new Bishop(0,5,"white_bishop_2",PieceIcons.BLACK_BISHOP, Team.BLACK);
	
	// Spawn White Queen and king.
	public static Queen whiteQueen = new Queen(7,3,"white_queen",PieceIcons.WHITE_QUEEN, Team.WHITE);
	public static King whiteKing = new King(7,4,"white_king",PieceIcons.WHITE_KING, Team.WHITE);
	
	// Spawn Black Queen and king.
	public static Queen blackQueen = new Queen(0,3,"white_queen",PieceIcons.BLACK_QUEEN, Team.BLACK);
	public static King blackKing = new King(0,4,"white_king",PieceIcons.BLACK_KING, Team.BLACK);
}
