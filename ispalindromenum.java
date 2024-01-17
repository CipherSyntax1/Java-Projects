import java.util.Scanner;

class ispalindromenum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter any number");
    int num = input.nextInt();

    int rev = 0;
    int temp = num;
    while (temp != 0) {
      int digit = temp % 10;
      rev = rev * 10 + digit;
      temp /= 10;
    }
    if (num == rev) {
      System.out.println("The number is a palindrome");
    }
    else {
      System.out.println("The number is not a palindrome and is reversed to: " + rev);
    }
  }
}