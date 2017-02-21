package hw2;

class HW2Driver {
  public static void main(String[] args) {
    // To test your code, experiment with other players
    // you implement. Of course, before experimenting with those
    // other players, test code as you write it.
	Board b = new Board(5,7,4);
    Player p1 = new HumanPlayer(1);  //one can change this to rightmostplayer or leftmostplayer or other computers like that
    Player p2 = new LeftmostPlayer(2);
    Game.play(6, 7, 4, p1, p2);  //input parameters in the game method 
    
    // TODO this is where you can test what you create
    // and have fun--e.g., pair up a LeftmostPlayer and a
    // HighestColumnPlayer and see who wins.
    // This file is not graded.
  }
}
//
