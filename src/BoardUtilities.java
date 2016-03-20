
public class BoardUtilities {
	
	public static boolean isValidPosition(int x, int y){
		return x > 7 || y > 7 || x < 0 || y < 0;		
	}

}
