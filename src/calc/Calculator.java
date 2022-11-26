package calc;

import calMethods.CalculationMethods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] argd) {

        Scanner keyboardentry = new Scanner(System.in);
        int a;
        int b;


        while (true) {
            try {
                System.out.println("Select the operation you want to run!");
                System.out.println("1: Addition \n2: Subtraction \n3: Multiplication \n4: Division \n5: Sinus \n" +
                        "6: Cosinus \n7: Tangent\n8: Squareroot \n9: Power\n10: Mod \n0: Exit");
                int operand = keyboardentry.nextInt();
                switch (operand) {
                    case 0:
                        System.exit(0);
                    case 1:
                        System.out.println("You selected: Addition");
                        System.out.println("Please enter your first number");
                        a = keyboardentry.nextInt();
                        System.out.println("Please enter your second number");
                        b = keyboardentry.nextInt();
                        CalculationMethods.add(a, b);
                        break;
                    case 2:
                        System.out.println("You selected: Subtraction");
                        System.out.println("Please enter your first number");
                        a = keyboardentry.nextInt();
                        System.out.println("Please enter your second number");
                        b = keyboardentry.nextInt();
                        CalculationMethods.subtract(a, b);
                        break;
                    case 3:
                        System.out.println("You selected: Multiplication");
                        System.out.println("Please enter your first number");
                        a = keyboardentry.nextInt();
                        System.out.println("Please enter your second number");
                        b = keyboardentry.nextInt();
                        CalculationMethods.multiply(a, b);
                        break;
                    case 4:
                        System.out.println("You selected: Division");
                        System.out.println("Please enter your first number");
                        a = keyboardentry.nextInt();
                        System.out.println("Please enter your second number");
                        b = keyboardentry.nextInt();
                        CalculationMethods.divide(a, b);
                        break;
                    case 5:
                        System.out.println("You selected: Sinus");
                        System.out.println("Please enter your first number");
                        a = keyboardentry.nextInt();
                        System.out.println("Please enter your second number");
                        b = keyboardentry.nextInt();
                        CalculationMethods.sinus(a, b);
                        break;
                    case 6:
                        System.out.println("You selected: Cosinus");
                        System.out.println("Please enter your first number");
                        a = keyboardentry.nextInt();
                        System.out.println("Please enter your second number");
                        b = keyboardentry.nextInt();
                        CalculationMethods.cosinus(a, b);
                        break;
                    case 7:
                        System.out.println("You selected: Tangent");
                        System.out.println("Please enter your first number");
                        a = keyboardentry.nextInt();
                        System.out.println("Please enter your second number");
                        b = keyboardentry.nextInt();
                        CalculationMethods.tan(a, b);
                        break;
                    case 8:
                        System.out.println("You selected: Squareroot");
                        System.out.println("Please enter your first number");
                        a = keyboardentry.nextInt();
                        System.out.println("Please enter your second number");
                        b = keyboardentry.nextInt();
                        CalculationMethods.sqrt(a, b);
                        break;
                    case 9:
                        System.out.println("You selected: Power");
                        System.out.println("Please enter your first number");
                        a = keyboardentry.nextInt();
                        System.out.println("Please enter your second number");
                        b = keyboardentry.nextInt();
                        CalculationMethods.power(a, b);
                        break;
                    case 10:
                        System.out.println("You selected: Mod");
                        System.out.println("Please enter your first number");
                        a = keyboardentry.nextInt();
                        System.out.println("Please enter your second number");
                        b = keyboardentry.nextInt();
                        CalculationMethods.mod(a, b);
                        break;
                    default:
                        System.out.println("The function you have entered has been misspelled or has not yet been implemented!");
                        break;

                }
            } catch (Exception e) {
                System.out.println("Error. Try again.");
                return;
            }
        }


    }
}

