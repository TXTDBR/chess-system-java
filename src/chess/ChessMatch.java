package chess;

import bordegame.Board;
import bordegame.Position;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
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
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.BLACK), new Position(4, 3));
		board.placePiece(new Rook(board, Color.WHITE), new Position(7, 3));
	}
}
