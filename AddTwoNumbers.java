import java.util.Scanner;

public class AddTwoNumbers {
    public static void main (String[] args) {
        int number1, number2, sum;

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter first number: ");
        number1 = scnr.nextInt();
        System.out.println("Enter second number: ");
        number2 = scnr.nextInt();
        sum = number1 + number2;

        System.out.println("Sum : " + sum);

    }
}
