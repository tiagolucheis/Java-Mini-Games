package game;

import boardgame.BoardException;

public class GameException extends BoardException {

	private static final long serialVersionUID = 1L;

	public GameException(String message) {
		super(message);
	}
	
}