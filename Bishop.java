package a1;

import java.util.ArrayList;

public class Bishop extends ChessPiece{

	public Bishop(ChessBoard board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		if(color.equals(Color.BLACK))
			return "\u265D";
		return "\u2657";
	}

	@Override
	public ArrayList<String> legalMoves() {
		// TODO Auto-generated method stub
		return null;
	}

}
