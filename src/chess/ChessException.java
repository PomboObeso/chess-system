package chess;

import boardgame.BoardgameException;

public class ChessException extends BoardgameException {
	private static final long serialVersionUID = 1L;
	
	public ChessException(String msg) {
		super(msg);
	}
}
