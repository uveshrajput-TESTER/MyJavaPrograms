package Questions;

import java.util.Scanner;

public class Calculator {

    static void main(String[] args) {
        System.out.println("Welcome to the Calculator");
        Scanner sc = new Scanner(System.in);
        int result;
        boolean bool = true;
        while (bool){
            System.out.println("Enter the first Integer value  ");
            int value = sc.nextInt();
            System.out.println("Enter the Second Integer value ");
            int value2 = sc.nextInt();
            System.out.println("Enter the Operators from these --> +,-,/,*,% ");
            System.out.println("Press x or X for Exit ");
             String operator = sc.next();
            switch (operator) {
                case "+":
                    result = value + value2;
                    System.out.println(result);
                    break;
                case "-":
                    result = value - value2;
                    System.out.println(result);
                    break;
                case "/":
                    result = value / value2; System.out.println(result);
                    break;
                case "*":
                    result = value * value2; System.out.println(result);
                    break;
                case "%":
                    result = value % value2; System.out.println(result);
                    break;
                case "X", "x":
                    bool = false;
                    break;
                default:
                    System.out.println("Enter valid Operator ");
            }



        }
    }
}
