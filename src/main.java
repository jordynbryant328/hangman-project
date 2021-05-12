import java.awt.*;
import javax.swing.*;
import java.awt.geom.Line2D;
import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   char [] key = {'o', 'p', 'e', 'n',};
   char guessChar;
   boolean lives;
   int life = 10;
   
   while (lives=true) {
   System.out.println("Welcome to the hangman game! Enter your first guess:");
   guessChar = input.next().charAt(0);
   if (guessChar == key[0]) {
     System.out.println("" + key[0] + "");
   } else if (guessChar != key[0]) {
     life--;
     System.out.println("Try again:");
     guessChar = input.next().charAt(0);
   }
   if (guessChar == key[1]) {
     System.out.println("" + key[0] + "" + key[1]);
   } else if (guessChar != key[1]) {
     life--;
     System.out.println("Try again:");
     guessChar = input.next().charAt(0);
   }
   
    if (guessChar == key[2]) {
     System.out.println("" + key[0] + "" + key[1] + "" + key[2]);
   } else if (guessChar != key[2]) {
     life--;
     System.out.println("Try again:");
     guessChar = input.next().charAt(0);
   }
   if (guessChar == key[3]) {
     System.out.println("" + key[0] + "" + key[1] + "" + key[2] + "" + key[3]);
   } else if (guessChar != key[3]) {
     life--;
     System.out.println("Try again:");
     guessChar = input.next().charAt(0);
   }
    if (lives = false) {
      System.out.println("You are out of lives - Game Over.");
    }
  }
}
}
