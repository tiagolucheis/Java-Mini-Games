package game;

import java.util.ArrayList;
import java.util.List;

import boardgame.Board;
import boardgame.Piece;

public class Match {

	private Board board;
	private int turn;
	private Symbol currentPlayer;
	
	private List<Piece> piecesOnTheBoard = new ArrayList<>();
	
	public Match(Symbol firstPlayer) {
		board = new Board(3, 3);
		turn = 1;
		currentPlayer = firstPlayer;
		
	}
	
	
	
}
