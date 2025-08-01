package Questions;

import java.util.Scanner;

public class posiNegZero {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("Enter the number : -");
        int num = o.nextInt();
        if (num == 0)
            System.out.println("Zero");
        else if (num>0)
            System.out.println("positive");
        else
            System.out.println("Negative");



    }
}
