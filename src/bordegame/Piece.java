package bordegame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board bord) {
		this.board = bord;
		this.position = null;
	}

	protected Board getBoard() {
		return board;
	}
}
