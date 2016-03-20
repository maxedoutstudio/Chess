import java.util.ArrayList;

public interface Piece {	
	public ArrayList<Move> getPossibleMoves(int x, int y) throws Exception;
	public  String toString();

}
