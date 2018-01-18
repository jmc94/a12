package a1;

import java.util.ArrayList;

public abstract class ChessPiece {

	public enum Color {WHITE, BLACK}
	
    protected ChessBoard board; // the board it belongs to, default null
    protected int row; // the index of the horizontal rows 0..7
    protected int column; // the index of the vertical column 0..7
    protected Color color; // the color of the piece 
    
    public ChessPiece(ChessBoard board, Color color) {
    	this.board = board;
    	this.color = color;
    }
    
    public Color getColor() {
    	return color;
    }
    
    public String getPosition() {
    	return rcToPos(row, column);
    }
    
    public void setPosition(String position) throws IllegalPositionException {
    	int[] temp = board.posToIndex(position);
    	row = temp[1];
    	column = temp[0];
    }
    
    public String rcToPos(int row, int column) {
    	row +=1;
    	String letter = "";
    	switch(column) {
    	case 0: letter = "a";
    	break;
    	case 1: letter = "b";
    	break;
    	case 2: letter = "c";
    	break;
    	case 3: letter = "d";
    	break;
    	case 4: letter = "e";
    	break;
    	case 5: letter = "f";
    	break;
    	case 6: letter = "g";
    	break;
    	case 7: letter = "h";
    	}
    	return letter + "" + row;
    }
    
    abstract public String toString();
    
    abstract public ArrayList<String> legalMoves();
    
    public static void main(String[] args) {
    	ChessBoard b = new ChessBoard();
    	Rook cp = new Rook(b, Color.BLACK);
    	System.out.println(cp.rcToPos(7,7));
    }
}