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

	public int getTurn() {
		return turn;
	}	
	
	public ArrayList<ArrayList<Piece>> getPieces(){
		
		ArrayList<ArrayList<Piece>> mat = new ArrayList<ArrayList<Piece>>();
		
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat.get(i).add(j, board.piece(i, j));
			}
		}
		return mat;
	}
	
	
}
