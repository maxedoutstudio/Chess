
public abstract class Piece {
	
	//Static members
	
	public final static boolean BLACK = false;
	
	public final static boolean WHITE = true;
	
	//Members
	
	private boolean player;
	
	
	Piece(){
	}
	
	Piece(boolean player){
		this.player = player;
	}
	
	//Abstract stuff
	
	public abstract String toString();

}
