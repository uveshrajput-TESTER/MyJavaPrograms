package Questions;

import java.util.Scanner;

public class timesof3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Integer number ");
        int num = sc.nextInt();
        System.out.println("what you want to count");
        int check = sc.nextInt();
        int count = 0;

        while (num > 0) {
            int rem = num % 10;
            if (rem == check) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);

    }
    }

