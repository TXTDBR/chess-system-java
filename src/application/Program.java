package application;

import chess.ChessMatch;
import chess.ChessPiece;

public class Program {

	public static void main(String[] arg) {
		
		ChessMatch chessMatch = new ChessMatch();
		
		UI.printBoard(chessMatch.getPieces());
	}
}
