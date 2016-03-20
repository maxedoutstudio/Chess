import java.util.ArrayList;

public class King implements Piece{

	final Color player;
	final String piece_name ="king";

	public King(String color) throws Exception{
		color = color.trim().toLowerCase();
		switch(color){
		case "white":
			this.player = Color.White;
			break;
		case "black":
			this.player = Color.Black;
			break;
		default:
			throw new Exception("Illegal Color");
		}
	}


	/**This function returns list of possible moves which then should be filtered
	 * by board since some of the moves cannot be made because some rules.
	 * 
	 * */

	@Override
	public ArrayList<Move> getPossibleMoves(int x, int y) throws Exception {
		ArrayList<Move> pos_moves= new ArrayList<>();
		if(BoardUtilities.isValidPosition(x,y)){
			throw new Exception("Illegal Position");
		}
		else if(x > 0 && x < 7 && y > 0 && y <7){
			upper3squares(x, y, pos_moves);			
			lower3squares(x, y, pos_moves);			
			pos_moves.add(new Move(x-1,y));
			pos_moves.add(new Move(x+1,y));

		}		
		else if(y == 0 && (x != 0 || x != 7)){
			upper3squares(x, y, pos_moves);
			pos_moves.add(new Move(x-1,y));
			pos_moves.add(new Move(x+1,y));
		}
		else if(y == 7 && (x != 0 || x != 7)){
			lower3squares(x, y, pos_moves);
			pos_moves.add(new Move(x-1,y));
			pos_moves.add(new Move(x+1,y));		
		}
		else if(x == 0 && (y != 0 || y != 7)){
			pos_moves.add(new Move(x,y-1));
			pos_moves.add(new Move(x,y+1));
			
			right3squares(x, y, pos_moves);	
		}
		else if(x == 7 && (y != 0 || y != 7)){
			pos_moves.add(new Move(x,y-1));
			pos_moves.add(new Move(x,y+1));			
			left3squares(x, y, pos_moves);	
		}
		else {
			if(x == 0 && y == 0){
				pos_moves.add(new Move(x,y+1));
				pos_moves.add(new Move(x+1,y+1));
				pos_moves.add(new Move(x+1,y));
			}
			else if(x == 7 && y == 0){
				pos_moves.add(new Move(x,y+1));
				pos_moves.add(new Move(x-1,y+1));
				pos_moves.add(new Move(x-1,y));
				
			}
			else if(x == 0 && y == 7){
				pos_moves.add(new Move(x+1,y));
				pos_moves.add(new Move(x+1,y-1));
				pos_moves.add(new Move(x,y-1));
				
			}
			else{//(x == 7 && y == 7)
				pos_moves.add(new Move(x-1,y));
				pos_moves.add(new Move(x-1,y-1));
				pos_moves.add(new Move(x,y-1));
				
			}			
		}
		return pos_moves;
	}


	private void left3squares(int x, int y, ArrayList<Move> pos_moves) {
		pos_moves.add(new Move(x-1,y));
		pos_moves.add(new Move(x-1,y-1));	
		pos_moves.add(new Move(x-1,y+1));
	}


	private void right3squares(int x, int y, ArrayList<Move> pos_moves) {
		pos_moves.add(new Move(x+1,y));
		pos_moves.add(new Move(x+1,y-1));	
		pos_moves.add(new Move(x+1,y+1));
	}


	private void lower3squares(int x, int y, ArrayList<Move> pos_moves) {
		pos_moves.add(new Move(x,y-1));
		pos_moves.add(new Move(x+1,y-1));
		pos_moves.add(new Move(x-1,y-1));
	}


	private void upper3squares(int x, int y, ArrayList<Move> pos_moves) {
		pos_moves.add(new Move(x+1,y+1));
		pos_moves.add(new Move(x-1,y+1));
		pos_moves.add(new Move(x,y+1));
	}

	@Override
	public String toString() {
		return piece_name+"-"+player.getStringValue();
	}

}
