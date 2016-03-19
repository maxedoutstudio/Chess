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
	
	Board(String fileName){
		loadFile(fileName);
	}
	
	//Movement related
	
	public void movePiece(int[] p1, int[] p2){
		
		//Gets the piece at p1
		
		Piece p = board[p1[0]][p1[1]];
		
		if(p == null){
			//@TODO Add validation for p1 not being null
		}
		
		//@TODO Add turn validation
		
		//Checks the piece name
		
		String name = p.getName();
		
		
		//@TODO Call their respective function
		
	}
	
	//Individual piece movements
	
	public void movePawn(int[] p1,int p2[]){
		
		//Checks which type of move it is
		
		//if(p2 == )
		
	}
	
	
	//Getters 
	
	public Piece getPiece(int[] position){
		return board[position[0]][position[1]];
	}
	
	public void getPossibleMoves(int[] position){
		
		Piece p = board[position[0]][position[1]];
		
		//Checks which piece it is
		
		String name = p.getName();
		
		//Calls the respective function
		
		if(name.equals("Pawn")){
			getPossiblePawnMoves(position);
		}
		
	}
	
	//Piece types get possible moves
	
	public void getPossiblePawnMoves(int[] position){
		
		//@TODO Add en passant logic
		
		//Checks if the piece is on its starting row
		
		boolean startingRow = false;
		
		//
		
		
	}
	
	
	public boolean isCheck(){
		
	}
	
	//Saving and loading
	
	public void saveFile(String fileName) {
		
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
	
	public void loadFile(String fileName) {
		
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
