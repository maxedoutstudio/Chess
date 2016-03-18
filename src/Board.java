import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
		
		try{
		
			FileWriter writer = new FileWriter(fileName);
			
			
			for(int i = 0;i<board.length;i++){
				
				for(int j = 0;j<board[i].length;j++){
					
					if(board[i][j] == null){
						writer.write("Empty");
					} else {
						writer.write(board[i][j].toString());
					}
					
					if(j != board[i].length){
						writer.write(",");
					}
					
				}
			}
			
			writer.close();
		} catch (IOException e) {
			
		}
	}
	

}
