package a1;

import java.util.ArrayList;

public class Knight extends ChessPiece{

	public Knight(ChessBoard board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		if(color.equals(Color.BLACK))
			return "\u265E";
		return "\u2658";
	}

	@Override
	public ArrayList<String> legalMoves() {
		// TODO Auto-generated method stub
		return null;
	}

}
