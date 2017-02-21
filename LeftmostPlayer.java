package hw2;

public class LeftmostPlayer extends Player {

  // TODO implement a constructor (see HumanPlayer)
  // There should be no reading from or writing to the console anywhere
  // in this class

  public LeftmostPlayer(int t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

@Override
  int nextMove(Board board) {
    // TODO this player always plays in the leftmost column that
    // is not yet full

	int check=0; //starts from the left 
	while(check<board.getWidth()){
		
		if(board.canAddTo(check)){
			return check; //check is actually the column number 
			
		}
		check++; //adding at the bottom allows everything to be checked properly
		
	}
	System.out.println("This Board is entirely full!");
	return -1;  //if everything is full 
   
  }

}
