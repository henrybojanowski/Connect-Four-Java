package hw2;

/**
 * @author: ENTER YOUR FIRST AND LAST NAME HERE
 * @email: ENTER YOUR BU EMAIL HERE
 */
// use form board[1][2]=some value X or O
public class Board {
  // 0 means empty, 1 means X, 2 means O
	// a board is Instance variables
	//constructor allows us to create a board
	
  public static final char[] sym = {' ', 'X', 'O'};
  private int[][] board;
  private int height, width;
  private int winLength;
  private int CheckersOnBoard;

  public Board(int h, int w, int winLen) {
    height = h;
    width = w;
    winLength = winLen;
    board = new int[height][width];
    // Java initializes new array elements to 0 automatically, so the board is empty
  }
  public int leftMostUnfilled(){
	  // check if the top value of each column is empty(left to right)
	  int left =0;
	  while(left<width && board[height-1][left] !=0){
		  left++;
		  
	  }
	  return left;
	  // returns the left-most column that is not totally full
  }
  

  public int getWidth() {
    return width;
  }

  public void addChecker(int type, int column) {
    // TODO Fill in, so that checker of a given type (1 or 2)
    // is added on top of the existing stack of checkers
    // in a given column
	  // possibly iterate through that specific row?
	  int check=0;
	  while(check<(height-1) && board[check][column]!=0){ //assuming index zero starts at the top-left(row) and bottom-left(col)
		  // start from the bottom and go to the top
		  
		  check++;
	  }
	  board[check][column]=type;
	  CheckersOnBoard++; // increment the variable so we can count how many checkers are on the board
	  
  }
  public int findhowfull(int column){
	  int check=0;
	  while(check<(height-1) && board[check][column]!=0){ //assuming index zero starts at the top-left(row) and bottom-left(col)
		  // start from the bottom and go to the top
		  
		  check++;
	  }
	  return check-1;//because variable check is the index to be added to(not how full)
	  
  }

  public boolean canAddTo(int column) {
    // TODO return whether a checker can be added to the column
	  // add a checker to the board-this may check if the board is already full 
    if(board[height-1][column]!=0){
    	return false;  //if there is something in the top column
    }
    else{
    	return true; // if the top column is empty
    }
    
    
  }

  public boolean isFull() {
    // TODO Return whether the entire board is filled in
    // For full credit: do not scan the entire board or even just
    // the column tops. Instead, add a variable to the class
    // that tells you how many pieces you already have on the board
    // and consult that variable
	  int maxcheckers=height*width;
	  if(CheckersOnBoard==maxcheckers){
		  return true;
	  }
	  else{
		  return false;
	  }
	  
   
  }

  private boolean hasWonVertically(int type) {
    // TODO Return whether there are winLength checkers of the given type
    // consecutively in any single column
	int check=winLength-1;
    for(int col=0;col<(width-winLength);col++){
    	for(int row=0;row<(height-winLength);row++){
    		if(board[col][row]==type){
    			int r=row;
    			int c=col;
    			while(check>0){
    				col++;
    				check--;
    				if(board[col][row]==type &&check==0){
    					return true;
    				}
    				if(board[col][row]==type){
    					
    				}
    				if(board[col][row]!=type){
    					row=r;//reset row to what it was before the loop
    					col=c;//reset col to what it was before the loop
    					check=winLength-1; //reset the checker
    					break;  // if there's not consecutive types, break out 
    				}
    				
    			}
    
    			
    		}
 
    		}
    	
    	}
    return false; //after iterating through for loops and there's no win 
    }
    
  

  private boolean hasWonHorizontally(int type) {
    // TODO Return whether there are winLength checkers of the given type
    // consecutively in any single row
	  int check=winLength-1;
	    for(int row=0;row<(height-winLength);row++){ //must change range or OB error
	    	for(int col=0;col<(width-winLength);col++){
	    		if(board[row][col]==type){
	    			int r=row;
	    			int c=col;
	    			while(check>0){
	    				col++;
	    				check--;
	    				if(board[row][col]==type &&check==0){
	    					return true;
	    				}
	    				if(board[row][col]==type){
	    					
	    				}
	    				if(board[row][col]!=type){
	    					row=r;//reset row to what it was before the loop
	    					col=c;//reset col to what it was before the loop
	    					check=winLength-1; //reset the checker
	    					break;  // if there's not consecutive types, break out 
	    				}
	    				
	    			}
	    			
	    		}
	 
	    		}
	    	
	    	}
	    return false; //after iterating through for loops and there's no win 
	    }
  

  private boolean hasWonNW(int type) {
    // TODO Return whether there are winLength checkers of the given type
    // consecutively on a diagonal that is oriented SouthEast-NorthWest
	  int check=winLength-1;
	    for(int row=0;row<(height-winLength);row++){ //must change range or OB error
	    	for(int col=0;col<(width-winLength);col++){
	    		if(board[row][col]==type){
	    			int r=row;
	    			int c=col;
	    			while(check>0){
	    				col++;
	    				row++;
	    				check--;
	    				if(board[row][col]==type &&check==0){
	    					return true;
	    				}
	    				if(board[row][col]==type){
	    					
	    				}
	    				if(board[row][col]!=type){
	    					row=r;//reset row to what it was before the loop
	    					col=c;//reset col to what it was before the loop
	    					check=winLength-1; //reset the checker
	    					break;  // if there's not consecutive types, break out 
	    				}
	    				
	    			}
	    			
	    		}
	 
	    		}
	    	
	    	}
	    return false; //after iterating through for loops and there's no win 
  }

  private boolean hasWonNE(int type) {
    // TODO Return whether there are winLength checkers of the given type
    // consecutively on a diagonal that is oriented SouthWest-NorthEast
	  int check=winLength-1;
	    for(int row=(height-1);row<(height-winLength);row--){ //must change range or OB error
	    	for(int col=0;col<(width-winLength);col++){
	    		if(board[row][col]==type){
	    			int r=row;
	    			int c=col;
	    			while(check>0){
	    				col++;
	    				row--;
	    				check--;
	    				if(board[row][col]==type &&check==0){
	    					return true;
	    				}
	    				if(board[row][col]==type){
	    					
	    				}
	    				if(board[row][col]!=type){
	    					row=r;//reset row to what it was before the loop
	    					col=c;//reset col to what it was before the loop
	    					check=winLength-1; //reset the checker
	    					break;  // if there's not consecutive types, break out 
	    				}
	    				
	    			}
	    			
	    		}
	 
	    		}
	    	
	    	}
	    return false; //after iterating through for loops and there's no win 
   
  }


  public boolean hasWon(int type) {
    // TODO return whether there are winLength checkers
    // of the given type consecutively vertically,
    // horizontally, or diagonally (hint: use previous four methods)
    
    if(hasWonVertically(type)==true || hasWonHorizontally(type) || hasWonNW(type)==true || hasWonNE(type)==true){
    	return true; 
    }
    else{
    	return false;
    }
  }


  // DO NOT MODIFY THIS METHOD
  public String toString() {
    String s = "";
    for (int i = height - 1; i >= 0; i--) {
      for (int j = 0; j < width; j++) {
        s += "|" + sym[board[i][j]];
      }
      s += "|\n";
    }
    for (int j = 0; j < width; j++) {
      s += "--";
    }
    s += "-\n";
    for (int j = 0; j < width; j++) {
      s += " " + j % 10;
    }
    s += "\n";
    return s;
  }
  
 

}
