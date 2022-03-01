package boardgame;

import java.util.ArrayList;

public class Piece {

	Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
	}
	
	Board getBoard() {
		return board;
	}
	
	public ArrayList<ArrayList<Boolean>> possibleMoves(){
		// To implement
		return null;
	}
	
	public boolean isThereAnyPossibleMove() {
		
		ArrayList<ArrayList<Boolean>> possibleMoves = possibleMoves();
		
		for (ArrayList<Boolean> arrayList : possibleMoves) {
			for (Boolean possibleMove : arrayList) {
				if (possibleMove.booleanValue()) {
					return true;
				}
			}
		}
		return false;
		
	}
	
}