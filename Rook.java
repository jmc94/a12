package a1;

import java.util.ArrayList;

public class Rook extends ChessPiece{

	public Rook(ChessBoard board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		if(color.equals(Color.BLACK))
			return "\u265C";
		return "\u2656";
	}

	@Override
	public ArrayList<String> legalMoves() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		ChessBoard b = new ChessBoard();
		Rook r = new Rook(b, Color.BLACK);
		System.out.println(r);
		
	}

}
