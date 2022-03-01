package game;

import boardgame.Position;

public class BoardPosition {

		private char column;
		private int row;
		
		public BoardPosition(char column, int row) {
			if(column < 'a' || column > 'c' || row < 1 || row > 3) {
				throw new GameException("Error instantiating BoardPosition. Valid values are from a1 to c3.");
			}
			this.column = column;
			this.row = row;
		}

		public char getColumn() {
			return column;
		}

		public int getRow() {
			return row;
		}
		
		Position toPosition() {
			return new Position(3 - row, column - 'a');
		}
		
		static BoardPosition fromPosition(Position position) {
			return new BoardPosition((char)('a' + position.getColumn()), 3 - position.getRow());
		}
		
		@Override
		public String toString() {
			return "" + column + row;
		}
		
	
}
