
/**
 * This is a class of a simple calculator
 *
 * @author Michael
 * @version 0.1
 */
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstNumber;
        double secondNumber;
        String operator;
        String continueOrNot;

        do {
            System.out.println("Please input your first number.");
            firstNumber = scanner.nextDouble();
            System.out.println("Please input your operator (only plus(+), minus(-), times(*), divide(/), mode(%), power(^) are supported.).");
            operator = scanner.next();
            System.out.println("Please input your second number.");
            secondNumber = scanner.nextDouble();

            switch (operator) {
                case "+":
                    if ((firstNumber + secondNumber) % 1 != 0) {
                        System.out.println("Sum: " + (firstNumber + secondNumber));
                    } else {
                        System.out.println("Sum: " + (int) (firstNumber + secondNumber));
                    }
                    break;
                case "-":
                    if ((firstNumber - secondNumber) % 1 != 0) {
                        System.out.println("Difference: " + (firstNumber - secondNumber));
                    } else {
                        System.out.println("Difference: " + (int) (firstNumber - secondNumber));
                    }
                    break;
                case "*":
                    if ((firstNumber - secondNumber) % 1 != 0) {
                        System.out.println("Product: " + (firstNumber * secondNumber));
                    } else {
                        System.out.println("Product: " + (int) (firstNumber * secondNumber));
                    }
                    break;
                case "/":
                    if ((firstNumber / secondNumber) % 1 != 0) {
                        System.out.println("Quotient: " + (firstNumber / secondNumber));
                    } else {
                        System.out.println("Quotient: " + (int) (firstNumber / secondNumber));
                    }
                    break;
                case "^":
                    if (Math.pow(firstNumber, secondNumber) % 1 != 0) {
                        System.out.println("Answer: " + (Math.pow(firstNumber, secondNumber)));
                    } else {
                        System.out.println("Answer: " + (int) (Math.pow(firstNumber, secondNumber)));
                    }
                    break;
                case "%":
                    if (firstNumber % secondNumber % 1 != 0) {
                        System.out.println("Remainder: " + (firstNumber % secondNumber));
                    } else {
                        System.out.println("Remainder: " + (int) (firstNumber % secondNumber));
                    }
                    break;
                default:
                    System.out.println("operation is not supported");
                    break;
            }

            System.out.println("Do you want to do another calculation? (Yes/No)");
            continueOrNot = scanner.next();

        }while (continueOrNot.equals("Yes")) ;
    }
}
