package a1;

import java.util.ArrayList;

public class Pawn extends ChessPiece{

	public Pawn(ChessBoard board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		if(color.equals(Color.BLACK))
			return "\u265F";
		return "\u2659";
	}

	@Override
	public ArrayList<String> legalMoves() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
