import java.awt.geom.Line2D;
import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   String word = "open";
   char [] key = {'o', 'p', 'e', 'n',};
   String guessChar;
   int lives = 10;
   
   while (lives>0) {
   System.out.println("Welcome to the hangman game! Enter your first guess:");
   guessChar = input.next();
   if (guessChar = key[1]) {
     System.out.println("" + key[1] + "");
   } else if (guessChar != key[1]) {
     lives--;
     System.out.println("Try again:");
   }
    if (lives = 0) {
      System.out.println("You are out of lives - Game Over.");
    }
  }
  }
}
