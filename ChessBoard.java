package a1;

public class ChessBoard {
	private ChessPiece[][] board;
	
	public ChessBoard() {
		board = new ChessPiece[8][8];
	}
	
	public void initialize() {
		
	}
	
	public ChessPiece getPiece(String position) throws IllegalPositionException {
		return null;
	}
	
	public boolean placePiece(ChessPiece piece, String position) {
		int[] temp = posToIndex(position);
		board[temp[0]][temp[1]] = piece;
		return true;
	}
	
	private int[] posToIndex(String position) {
		int[] ret = new int[2];
		char letter = position.charAt(0);
		int fi = Integer.parseInt(position.substring(1));
		fi -= 1;
		int li = 0;
		switch(letter) {
		case 'a': li = 0;
			break;
		case 'b': li = 1;
			break;
		case 'c': li = 2;
			break;
		case 'd': li = 3;
			break;
		case 'e': li = 4;
			break;
		case 'f': li = 5;
			break;
		case 'g': li = 6;
			break;
		case 'h': li = 7;
		}
		ret[0] = fi;
		ret[1] = li;
		System.out.println("board[" +ret[0] + "][" + ret[1] + "]");
		return ret;
	}
	
	public static void main(String[] args) {
		ChessBoard b = new ChessBoard();
		b.posToIndex("h5");
	}
	
}
