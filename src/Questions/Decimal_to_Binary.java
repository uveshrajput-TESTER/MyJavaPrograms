package Questions;

import java.util.Scanner;

public class Decimal_to_Binary {
    static void main(String[] args) {
        System.out.println("(ٱلسَّلَامُعَلَيْكُمْ)ُ");
        System.out.println("Enter the Decimal value :- ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String Binary ="" ;
        int temp ;
        boolean condition = true ;
        while(condition){
            temp = num%2;
           Binary =  temp + Binary;
            num = num/2;
            if(num<=0){
                condition = false;
            }
        }
        Integer binary = Integer.valueOf(Binary);
        System.out.println(binary);

    }
}
//To convert the decimal number 47 to binary, repeatedly divide the number by 2 and record the quotient and remainder at each step. Continue until the quotient becomes 0. The binary representation is the sequence of remainders read from bottom to top.
//
//        Step-by-step calculation:
//
//        - 47 ÷ 2 = 23 (Quotient), Remainder 1
//        - 23 ÷ 2 = 11 (Quotient), Remainder 1
//        - 11 ÷ 2 = 5 (Quotient), Remainder 1
//        - 5 ÷ 2 = 2 (Quotient), Remainder 1
//        - 2 ÷ 2 = 1 (Quotient), Remainder 0
//        - 1 ÷ 2 = 0 (Quotient), Remainder 1
//
//Remainders (bottom to top): 1 0 1 1 1 1
//
//Thus, (47) in decimal = (101111) in binary.