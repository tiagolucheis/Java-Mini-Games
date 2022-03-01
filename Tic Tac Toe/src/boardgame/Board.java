package boardgame;

import java.util.ArrayList;

public class Board {

	private int rows;
	private int columns;
	private ArrayList<ArrayList<Piece>> pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
	}
	
	public Piece piece(Position position) {
		
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return pieces.get(position.getRow()).get(position.getColumn());
		
	}
	
	public void placePiece(Piece piece, Position position) {
		
		if (thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position " + position);
		}
		pieces.get(position.getRow()).add(position.getColumn(), piece);
		piece.position = position;
		
	}
	
	public boolean positionExists(int row, int column) {
		
		return row >= 0  && row < rows && column >= 0 && column < columns;
			
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}	
	
	public boolean thereIsAPiece(Position position) {
		
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
		
	}
	
}
