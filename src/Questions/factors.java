package Questions;

import java.util.Scanner;

public class factors {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-  ");
        int num = sc.nextInt();
        System.out.println("FActors of "+ num + "  :-  ");
        for (int i = 1; i <=num ; i++) {
            if (num % i != 0) {
                continue;
            }
            System.out.print(i + "  ");
        }
    }
}
