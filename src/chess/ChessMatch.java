package chess;

import bordegame.Board;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRow()][board.getCol()];
		for(int i = 0; i < board.getRow(); i++) {
			for(int j = 0; j < board.getCol(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
}
