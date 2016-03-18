import java.io.File;

public class Board {
	
	//Static Members
	
	private final static int BOARD_SIZE = 8;
	
	//Members
	
	private Piece[][] board;
	
	Board(){
		
		board = new Piece[BOARD_SIZE][BOARD_SIZE];
		
		for(int i = 0;i<board.length;i++){
			
			for(int j = 0;j<board[i].length;j++){
				
			}
			
		}
		
	}
	
	
	//Saving and loading
	
	public boolean saveFile(String fileName){
		
		File file = new File(fileName);
		
		FileWriter 
		
		
		for(int i = 0;i<board.length;i++){
			
			for(int j = 0;j<board[i].length;j++){
				
				
			}
		}
		
	}
	

}
