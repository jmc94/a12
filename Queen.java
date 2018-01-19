package a1;

import java.util.ArrayList;

public class Queen extends ChessPiece{

	public Queen(ChessBoard board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		if(color.equals(Color.BLACK))
			return "\u265B";
		return "\u2655";
	}

	@Override
	public ArrayList<String> legalMoves() {
		// TODO Auto-generated method stub
		return null;
	}

}
