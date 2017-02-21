package hw2;

public class Game {
  public static int play(int height, int width, int winLength, Player p1, Player p2) {
    Board b = new Board(height, width, winLength);
    System.out.println(b);
    // TODO: modify to quit playing and return the outcome as soon as
    // (a) p1 wins (return 1)
    // (b) p2 wins (return 2)
    // (c) the board fills up (return 0, because it's a tie)
    // Careful to make sure you work correctly regardless
    // of whether the size of the board is even or odd
    // 
    // do NOT change, remove, or add any print statements
    // 
    while (true) {
      System.out.println("X moves next.");
      b.addChecker(1, p1.nextMove(b));
      System.out.println(b);
      if(b.hasWon(1)){
    	  System.out.println("Player 1 has Won the game!");
    	  return 1;
      }

      System.out.println("O moves next.");
      if(b.hasWon(2)){
  	    System.out.println("Player 2 has Won the game!");
  	  return 2;
     }
      b.addChecker(2, p2.nextMove(b));
      System.out.println(b);
      if(b.hasWon(2)){
    	    System.out.println("Player 2 has Won the game!");
    	  return 2;
       }
      
      
      
      
      if(b.isFull()){
    	  System.out.println("The result is a tie!");
    	  return 0;
      }
    }
  }
}


