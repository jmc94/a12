package a1;

import a1.ChessPiece.Color;

public class ChessBoard {
	private ChessPiece[][] board;

	public ChessBoard() {
		board = new ChessPiece[8][8];
	}

	public void initialize() {
		Rook bR1 = new Rook(this, Color.BLACK);
		Rook bR2 = new Rook(this, Color.BLACK);
		
		Rook wR1 = new Rook(this, Color.WHITE);
		Rook wR2 = new Rook(this, Color.WHITE);
		
		placePiece(bR1, "a8");
		placePiece(bR2, "h8");
		placePiece(wR1, "a1");
		placePiece(wR2, "h1");
		
		Knight bK1 = new Knight(this, Color.BLACK);
		Knight bK2 = new Knight(this, Color.BLACK);
		
		Knight wK1 = new Knight(this, Color.WHITE);
		Knight wK2 = new Knight(this, Color.WHITE);
		
		placePiece(bK1, "b8");
		placePiece(bK2, "g8");
		placePiece(wK1, "b1");
		placePiece(wK2, "g1");
		
		Bishop bB1 = new Bishop(this, Color.BLACK);
		Bishop bB2 = new Bishop(this, Color.BLACK);
		
		Bishop wB1 = new Bishop(this, Color.WHITE);
		Bishop wB2 = new Bishop(this, Color.WHITE);
		
		placePiece(bB1, "c8");
		placePiece(bB2, "f8");
		placePiece(wB1, "c1");
		placePiece(wB2, "f1");
		
		Queen bQ = new Queen(this, Color.BLACK);
		Queen wQ = new Queen(this, Color.WHITE);
		
		placePiece(bQ, "d8");
		placePiece(wQ, "d1");
		
		King bK = new King(this, Color.BLACK);
		King wK = new King(this, Color.WHITE);
		
		placePiece(bK, "e8");
		placePiece(wK, "e1");
	}

	public ChessPiece getPiece(String position) throws IllegalPositionException {
		int[] temp = posToIndex(position);
		return board[temp[0]][temp[1]];
	}

	public boolean placePiece(ChessPiece piece, String position) {
		int[] temp = posToIndex(position);
		board[temp[0]][temp[1]] = piece;
		return true;
	}

	public void move(String fromPosition, String toPosition) throws IllegalMoveException {
		int[] fromPos = posToIndex(fromPosition);

		ChessPiece cPiece = board[fromPos[0]][fromPos[1]];
		board[fromPos[0]][fromPos[1]] = null;
		placePiece(cPiece, toPosition);
	}

	public int[] posToIndex(String position) {
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
	
		return ret;
	}

	public String toString() {
		String chess="";
		String upperLeft = "\u250C";
		String upperRight = "\u2510";
		String horizontalLine = "\u2500";
		String horizontal3 = horizontalLine + "\u3000" + horizontalLine;
		String verticalLine = "\u2502";
		String upperT = "\u252C";
		String bottomLeft = "\u2514";
		String bottomRight = "\u2518";
		String bottomT = "\u2534";
		String plus = "\u253C";
		String leftT = "\u251C";
		String rightT = "\u2524";

		String topLine = upperLeft;
		for (int i = 0; i<7; i++){
			topLine += horizontal3 + upperT;
		}
		topLine += horizontal3 + upperRight;

		String bottomLine = bottomLeft;
		for (int i = 0; i<7; i++){
			bottomLine += horizontal3 + bottomT;
		}
		bottomLine += horizontal3 + bottomRight;
		chess+=topLine + "\n";

		for (int row = 7; row >=0; row--){
			String midLine = "";
			for (int col = 0; col < 8; col++){
				if(board[row][col]==null) {
					midLine += verticalLine + " \u3000 ";
				} else {midLine += verticalLine + " "+board[row][col]+" ";}
			}
			midLine += verticalLine;
			String midLine2 = leftT;
			for (int i = 0; i<7; i++){
				midLine2 += horizontal3 + plus;
			}
			midLine2 += horizontal3 + rightT;
			chess+=midLine+ "\n";
			if(row>=1)
				chess+=midLine2+ "\n";
		}

		chess+=bottomLine;
		return chess;

	}

	public static void main(String[] args) {
		ChessBoard b = new ChessBoard();
		b.initialize();
		System.out.println(b);
	}

}