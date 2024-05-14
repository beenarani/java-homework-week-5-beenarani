package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //Scanner object declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        char choice;

        //Using do while loop
        do {
            System.out.println("Enter First Number:");
            int a = scanner.nextInt();
            System.out.println("Enter second Number:");
            int b = scanner.nextInt();

            System.out.print("Please enter one of symbol +,-,*, /: ");
            char symbol = scanner.next().charAt(0);

            calculator.calculateResult(a, b, symbol);

            System.out.print("Would you like to do more calculation? Please enter 'Y' or 'N': ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
         //Scanner close
        scanner.close();
    }
}