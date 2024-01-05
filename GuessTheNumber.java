import java.util.Scanner;
import java.util.Random;

class GuessTheNumber {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    while (true) {
      int number = rand.nextInt(10) + 1;
      System.out.println("Guess a number between 1 and 10: ");
      int guess = input.nextInt();

      if (guess == number) {
        System.out.println("Congratulations!, You are correct.");
        break;
      } else if (guess > number) {
        System.out.println("Try a smaller number.");
      } else {
        System.out.println("Try a bigger number.");
      }
    }
  }
}