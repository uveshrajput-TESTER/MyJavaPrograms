package Questions;

import java.util.Scanner;

public class reverseInteger {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Integer number ");
        int num = sc.nextInt();
    int reversenum = 0;
   while(num>0) {
       int rem = num % 10;
       reversenum = reversenum* 10 + rem;
       num = num/10;
   }
   System.out.println(reversenum);
}}
