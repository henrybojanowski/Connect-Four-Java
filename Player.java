package hw2;

// An abstract class is a class that has
// unimplemented (abstract) methods.
// These methods are implemented in sublcasses.
// An object of an abstract class can never be created -- you have
// to create an object of a subclass.
// In this problem set, we partially implement one subclass for you,
// and you will complete this one and implement four more.
public abstract class Player {

  protected int type; // 1 for X, 2 for O
  //protected is a visible in the parent class and the subclass

  public Player(int t) {
    type = t; // how we know if this is player X or 0
  }

  abstract int nextMove(Board board); // you actually have to provide the code for every object of player
}
