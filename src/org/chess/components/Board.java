package org.chess.components;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Dimension;
import javax.swing.border.LineBorder;
import java.awt.Color;
import org.chess.components.pieces.Pieces;

public class Board extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public BoardTile boardTiles[][] = {
		{
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
		},
		{
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
		},
		{
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
		},
		{
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
		},
		{
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
		},
		{
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
		},
		{
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
		},
		{
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
			new BoardTile(new Color(149,69,53)),
			new BoardTile(new Color(192,192,192)),
		},
	};
	
	public void positionPieces() {
		// Position white pawns
		boardTiles[Pieces.whitePawn1.getCoordY()][Pieces.whitePawn1.getCoordX()].add(Pieces.whitePawn1);
		boardTiles[Pieces.whitePawn2.getCoordY()][Pieces.whitePawn2.getCoordX()].add(Pieces.whitePawn2);
		boardTiles[Pieces.whitePawn3.getCoordY()][Pieces.whitePawn3.getCoordX()].add(Pieces.whitePawn3);
		boardTiles[Pieces.whitePawn4.getCoordY()][Pieces.whitePawn4.getCoordX()].add(Pieces.whitePawn4);
		boardTiles[Pieces.whitePawn5.getCoordY()][Pieces.whitePawn5.getCoordX()].add(Pieces.whitePawn5);
		boardTiles[Pieces.whitePawn6.getCoordY()][Pieces.whitePawn6.getCoordX()].add(Pieces.whitePawn6);
		boardTiles[Pieces.whitePawn7.getCoordY()][Pieces.whitePawn7.getCoordX()].add(Pieces.whitePawn7);
		boardTiles[Pieces.whitePawn8.getCoordY()][Pieces.whitePawn8.getCoordX()].add(Pieces.whitePawn8);
		
		// Position black pawns
		boardTiles[Pieces.blackPawn1.getCoordY()][Pieces.blackPawn1.getCoordX()].add(Pieces.blackPawn1);
		boardTiles[Pieces.blackPawn2.getCoordY()][Pieces.blackPawn2.getCoordX()].add(Pieces.blackPawn2);
		boardTiles[Pieces.blackPawn3.getCoordY()][Pieces.blackPawn3.getCoordX()].add(Pieces.blackPawn3);
		boardTiles[Pieces.blackPawn4.getCoordY()][Pieces.blackPawn4.getCoordX()].add(Pieces.blackPawn4);
		boardTiles[Pieces.blackPawn5.getCoordY()][Pieces.blackPawn5.getCoordX()].add(Pieces.blackPawn5);
		boardTiles[Pieces.blackPawn6.getCoordY()][Pieces.blackPawn6.getCoordX()].add(Pieces.blackPawn6);
		boardTiles[Pieces.blackPawn7.getCoordY()][Pieces.blackPawn7.getCoordX()].add(Pieces.blackPawn7);
		boardTiles[Pieces.blackPawn8.getCoordY()][Pieces.blackPawn8.getCoordX()].add(Pieces.blackPawn8);
		
		// Position whiteRooks.
		boardTiles[Pieces.whiteRook1.getCoordY()][Pieces.whiteRook1.getCoordX()].add(Pieces.whiteRook1);
		boardTiles[Pieces.whiteRook1.getCoordY()][Pieces.whiteRook2.getCoordX()].add(Pieces.whiteRook2);
		
		// Position black rooks.
		boardTiles[Pieces.blackRook1.getCoordY()][Pieces.blackRook1.getCoordX()].add(Pieces.blackRook1);
		boardTiles[Pieces.blackRook2.getCoordY()][Pieces.blackRook2.getCoordX()].add(Pieces.blackRook2);
		
		// Position white knights.
		boardTiles[Pieces.whiteKnight1.getCoordY()][Pieces.whiteKnight1.getCoordX()].add(Pieces.whiteKnight1);
		boardTiles[Pieces.whiteKnight2.getCoordY()][Pieces.whiteKnight2.getCoordX()].add(Pieces.whiteKnight2);
		
		// Position black knights.
		boardTiles[Pieces.blackKnight1.getCoordY()][Pieces.blackKnight1.getCoordX()].add(Pieces.blackKnight1);
		boardTiles[Pieces.blackKnight2.getCoordY()][Pieces.blackKnight2.getCoordX()].add(Pieces.blackKnight2);
		
		// Position white bishop.
		boardTiles[Pieces.whiteBishop1.getCoordY()][Pieces.whiteBishop1.getCoordX()].add(Pieces.whiteBishop1);
		boardTiles[Pieces.whiteBishop2.getCoordY()][Pieces.whiteBishop2.getCoordX()].add(Pieces.whiteBishop2);
		
		// Position black bishop.
		boardTiles[Pieces.blackBishop1.getCoordY()][Pieces.blackBishop1.getCoordX()].add(Pieces.blackBishop1);
		boardTiles[Pieces.blackBishop2.getCoordY()][Pieces.blackBishop2.getCoordX()].add(Pieces.blackBishop2);
		
		// Position white kings and queens.
		boardTiles[Pieces.whiteQueen.getCoordY()][Pieces.whiteQueen.getCoordX()].add(Pieces.whiteQueen);
		boardTiles[Pieces.whiteKing.getCoordY()][Pieces.whiteKing.getCoordX()].add(Pieces.whiteKing);
		
		boardTiles[Pieces.blackQueen.getCoordY()][Pieces.blackQueen.getCoordX()].add(Pieces.blackQueen);
		boardTiles[Pieces.blackKing.getCoordY()][Pieces.blackKing.getCoordX()].add(Pieces.blackKing);
	}
	
	/**
	 * Create the panel.
	 */
	public Board() {
		setBorder(new LineBorder(new Color(139, 69, 19), 3));
		setSize(new Dimension(600, 600));
		setLayout(new GridLayout(8, 8, 0, 0));
		for (BoardTile row[]: boardTiles) {
			for (BoardTile cell: row) {
				this.add(cell);
			}
		}
		
		// Sets the game to t
		this.positionPieces();

	}

}
