package Questions;

import java.util.Scanner;

public class FIbonacchi {
    static void main(String[] args) {
        System.out.print("Enter the nth number of Fibonchi :-  ");
        Scanner  sc = new Scanner(System.in);
        int num = sc.nextInt();
        int first = 0;
        int second = 1;
        int fib ;
        System.out.println(first +" " + second);
        for (int i = 0; i <num-2 ; i++) {
           fib = first + second ;
            System.out.println(fib);
            first = second ;
            second = fib;

        }


    }
}
