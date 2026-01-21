package Questions;

import java.util.Scanner;

public class Decimal_to_Octal {
    static void main(String[] args) {
        System.out.println("(ٱلسَّلَامُعَلَيْكُمْ)ُ");
        System.out.println("Enter the Decimal value :- ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String Octal ="" ;
        int temp ;
        boolean condition = true ;
        while(condition){
            temp = num%8;
            Octal =  temp + Octal;
            num = num/8;
            if(num<=0){
                condition = false;
            }
        }
        Integer octal = Integer.valueOf(Octal);
        System.out.println( "Octal number is :-   " + Octal);

    }
    }

