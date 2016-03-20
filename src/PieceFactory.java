
public class PieceFactory {
	
	
	public Piece getPiece(String name, String color) throws Exception{
		name=name.trim().toLowerCase();
		
		switch(name){
		case "king":
			return  new King(color);
		default:
			throw new Exception("Illegal name of a piece");
		
		}		
	}

}
