package hw2;

import java.util.Scanner;

public class LowestColumnPlayer extends Player {

  // TODO implement a constructor (see HumanPlayer)
  // There should be no reading from or writing to the console anywhere
  // in this class
	private Scanner sc;
	
	public LowestColumnPlayer(int t) {
	    super(t);
	    sc = new Scanner(System.in);
	  }

  @Override
  int nextMove(Board board) {
    // TODO this player always plays in the lowest column,
    // resolving ties to the left
	  int check=board.getWidth();
	  int lowestcolumnindex=board.getWidth();
	  int lowestcolumnvolume=board.getWidth();
	  while(check>0){
		  check--;
		  //find how full each column is, if it is less full than all the previous, change the variable
		  if(board.canAddTo(check)==true  && board.findhowfull(check)<lowestcolumnvolume){
			  lowestcolumnvolume=board.findhowfull(check);
			  lowestcolumnindex=check;
			  
		  }
	  }
	  return lowestcolumnindex;
	
  }

}
