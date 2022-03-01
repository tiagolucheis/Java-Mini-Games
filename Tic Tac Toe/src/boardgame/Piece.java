package boardgame;

import java.util.ArrayList;
import game.Symbol;

public class Piece {

	Position position;
	private Symbol symbol;
	private Board board;
	
	public Piece(Symbol symbol, Board board) {
		this.symbol = symbol;
		this.board = board;
	}
	
	public Symbol getSymbol() {
		return symbol;
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
	
	boolean IsThereOpponentPiece(Position position) {
		Piece piece = getBoard().piece(position);
		return piece != null && piece.getSymbol() != symbol;
	}
	
}