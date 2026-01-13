package Questions;

import java.util.Scanner;

public class Subtract_P_S {
    static void main(String[] args) {
//        Subtract the Product and Sum of Digits of an Integer
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the integer Digit :- ");
        int temp;
        int product = 1;
        int sum = 0  ;
        int num = sc.nextInt();
        while(num>0){
            temp = num%10;
            product = product*temp;
            sum =  sum + temp;
           num =  num/10;
        }
        System.out.println( " Sum of All digits  :- "+ sum);
        System.out.println( " product  of All digits  :- "+ product);
        System.out.println(product-sum);
    }
}
