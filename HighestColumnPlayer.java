package hw2;

import java.util.Scanner;

public class HighestColumnPlayer extends Player {

  // TODO implement a constructor (see HumanPlayer)
  // There should be no reading from or writing to the console anywhere
  // in this class
	
private Scanner sc;
	
	public HighestColumnPlayer(int t) {
	    super(t);
	    sc = new Scanner(System.in);
	  }

  @Override
  int nextMove(Board board) {
    // TODO this player always plays in the highest column that
    // is not yet full, resolving ties to the left
	  int check=board.getWidth();
	  int highcolumnindex=0;
	  int highcolumnvolume=0;
	  while(check>0){
		  check--;
		  if(board.canAddTo(check)){
			  if(board.findhowfull(check)>highcolumnvolume){
				  //findhowfull returns how full, not index
				  highcolumnvolume=board.findhowfull(check);
				  highcolumnindex=check;
				  
			  }
		  }
		  
    
	  }
	  return highcolumnindex;
	  
  }

}
