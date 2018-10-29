/*
* MakeGuesses.java
* 
* The following program uses a method called MakeGuesses that guesses numbers between 1 and
50 inclusive until it makes a guess of at least 48. It should report each
guess and at the end should report the total number of guesses made.
*
* By Nathan Betz
*/

import java.util.Random;

public class MakeGuesses {

  public static void main(String[]args) {
        MakeGuesses();
  }

  public static void MakeGuesses() {
  
    int total = 0;
    Random random = new Random();
    int guess = 0;
    while (guess < 48) {
    
      total ++;
      guess = 1 + random.nextInt(50);
      System.out.println("guess = " + guess);
      
      }
  
  System.out.println("total guesses = " + total);
  
  }
}
