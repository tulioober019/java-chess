package org.chess;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.chess.components.Board;
import org.chess.components.BoardTile;
import org.chess.components.pieces.Piece;
import org.chess.components.pieces.Pieces;
import org.chess.components.pieces.Team;

import java.util.ArrayList;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JLabel;

public class Game extends JFrame {

	private static final long serialVersionUID = 1L;
	public static Board chessBoard = new Board();
	public static Piece selectedPiece;
	public static int[] origin = new int[2];
	public static int[] destination = new int[2];
	public static ArrayList<BoardTile> highlightedPaths = new ArrayList<BoardTile> ();
	public static Team turn = Team.WHITE;
	public static Piece targetPiece;
	public static Team opponent = Team.BLACK;
	public static ArrayList<Piece> teamThreat = new ArrayList<Piece> ();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
					frame.setVisible(true);
					System.out.println(System.getProperty("user.dir"));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Game() {
		setTitle("Java Chess");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 670);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel southPanel = new JPanel();
		southPanel.setBackground(new Color(192, 192, 192));
		getContentPane().add(southPanel, BorderLayout.SOUTH);
		
		JLabel copyrightInfo = new JLabel("GNU General Public License");
		southPanel.add(copyrightInfo);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu gameMenu = new JMenu("Game");
		menuBar.add(gameMenu);
		
		JMenuItem gameNew = new JMenuItem("New Game");
		gameMenu.add(gameNew);
		
		JMenuItem gameLoad = new JMenuItem("Load Game");
		gameMenu.add(gameLoad);
		
		JMenuItem gameSave = new JMenuItem("Save Game");
		gameMenu.add(gameSave);
		
		JMenuItem gameQuit = new JMenuItem("Quit Game");
		gameMenu.add(gameQuit);
		
		JMenu helpMenu = new JMenu("Help");
		menuBar.add(helpMenu);
		
		add(chessBoard,BorderLayout.CENTER);
	}
	
	public static void collectData(Piece p) {
		// Setting new value for the selected piece.
		Game.selectedPiece = p;
		
		// Setting origin coordinates.
		Game.origin[0] = Game.selectedPiece.getCoordY(); // Y Coordinate
		Game.origin[1] = Game.selectedPiece.getCoordX(); // X Coordinate
		System.out.println("Selected " + Game.selectedPiece.getId() + " at coordinate (" + Game.origin[0] + "," + Game.origin[1] + ")");
	}
	
	public static void removeOldData() {
		try {
			for (BoardTile tile: Game.highlightedPaths) {
				tile.unHighlightTile();
			}
		} catch (NullPointerException e) {}
	}
	
	private static Piece[] getAllWhitePieces() {
		return new Piece[] {
			Pieces.whitePawn1,
			Pieces.whitePawn2,
			Pieces.whitePawn3,
			Pieces.whitePawn4,
			Pieces.whitePawn5,
			Pieces.whitePawn6,
			Pieces.whitePawn7,
			Pieces.whitePawn8,
			Pieces.whiteRook1,
			Pieces.whiteRook2,
			Pieces.whiteKnight1,
			Pieces.whiteKnight2,
			Pieces.whiteBishop1,
			Pieces.whiteQueen
		};
	}
	
	private static Piece[] getAllBlackPieces() {
		return new Piece[] {
			Pieces.blackPawn1,
			Pieces.blackPawn2,
			Pieces.blackPawn3,
			Pieces.blackPawn4,
			Pieces.blackPawn5,
			Pieces.blackPawn6,
			Pieces.blackPawn7,
			Pieces.blackPawn8,
			Pieces.blackRook1,
			Pieces.blackRook2,
			Pieces.blackKnight1,
			Pieces.blackKnight2,
			Pieces.blackBishop1,
			Pieces.blackQueen
		};	
	}
	
	public static Piece[] getAllPotencialThreats(Team t) {
		if (t == Team.WHITE) return getAllWhitePieces();
		else return getAllBlackPieces();
	}
}
