import java.util.Scanner;

public class Calculator {
  public static void main(string[] args) {

    Scanner scanner = new Scanner(System.in);
    double num1, num2, result;
    String operator;

    System.out.print("Enter the first number: ");
    num1 = scanner.nextDouble();
    System.out.print("Enter an operator (+, -, *, /): ");
    operator = scanner.next();
    System.out.print("Enter the second number: ");
    num2 = scanner.nextDouble();

    switch (operator) {
      case "+":
        result = num1 + num2;
        break;
      case "-":
        result = num1 - num2;
        break;
      case "*":
        result = num1 * num2;
        break;
      case "/":
        if (num2 == 0) {
          System.out.println("Error: Division by zero is not allowed.");
          return;
        }
        result = num1 / num2;
        break;
      default:
        System.out.println("Invalid operator!");
        return;
    }
        System.out.println("The result is: " + result);
  }
}
