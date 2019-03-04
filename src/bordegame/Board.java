package bordegame;

public class Board {

	private int row;
	private int col;
	private Piece[][] pieces;
	
	public Board(int row, int col) {
		if(row < 1 || col < 1) {
			throw new BoardException("Erro ao criar tabuleiro: É necessário ter pelo menos 1 linha e uma coluna!");
		}
		this.row = row;
		this.col = col;
		pieces = new Piece[row][col];
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}
	
	public Piece piece(int row, int col) {
		if(!this.positionExists(row, col)) {
			throw new BoardException("Erro: Possição não existe no tabuleiro!");
		}
		return this.pieces[row][col];
	}
	//sobrecarga de metodo
	public Piece piece(Position position) {
		if(!this.positionExists(position)) {
			throw new BoardException("Erro: Possição não existe no tabuleiro!");
		}
		return this.pieces[position.getRow()][position.getCol()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if(this.thereIsAPiece(position)) {
			throw new BoardException("Erro: Já existe uma peça nessa possição!" + position);
		}
		this.pieces[position.getRow()][position.getCol()] = piece;
		piece.position = position;
	}

	
	private boolean positionExists(int row, int col) {
		return row >= 0 && row < this.row && col >= 0 && col < this.col;	
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getCol(), position.getCol());	
	}
	
	public boolean thereIsAPiece(Position position) {
		if(!this.positionExists(position)) {
			throw new BoardException("Erro: Possição não existe no tabuleiro!");
		}
		return this.piece(position) != null;
	}
}
