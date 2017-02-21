package hw2;

import java.util.Scanner;

public class HumanPlayer extends Player {

  private Scanner sc;

  public HumanPlayer(int t) {
    super(t);
    sc = new Scanner(System.in);
  }

  @Override
  int nextMove(Board board) {
    System.out.print(Board.sym[type] + ", your move? ");
    int move;
    do {
      move = sc.nextInt();
    } while (move > board.getWidth()||move<0 ||board.isFull()
    		||board.canAddTo(move)==false);
    // all statements in the while loop should be false
    // TODO: currently, this checks only that the column
    // is not too high. Modify to check for other
    // bad inputs (column negative or full).
    // Do not remove, add, or change any print statements
    
    return move;
  }
}
// describes when the computer switches from player 1 to player 2
// playing the game against a computer(this call represents a CPU)
// system.in is taking input from the keyboard


