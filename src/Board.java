import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
	
	public void saveFile(String fileName) throws IOException,FileNotFoundException{
		
		File file = new File(fileName);
		
		try{
		
			FileWriter writer = new FileWriter(file);
			
			
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
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
	
	public void loadFile(String fileName) throws IOException,FileNotFoundException{
		
		File file = new File(fileName);
		
		Piece[][] newPieces = new Piece[BOARD_SIZE][BOARD_SIZE];
		
		int rowCounter = 0;
		
		try{
		
			String line;
			
			FileReader reader = new FileReader(fileName);
			
			BufferedReader br = new BufferedReader(reader);
			
			while ((line = br.readLine()) != null) {
				
				String[] row = line.split(",");
				
				for(int i = 0;i<row.length;i++){
					String[] parts = row[i].split(" ");
					newPieces[rowCounter][i] = new Piece(parts[0],parts[1]);
				}
				
				rowCounter++;
			}
		
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
			
	}
	

}
