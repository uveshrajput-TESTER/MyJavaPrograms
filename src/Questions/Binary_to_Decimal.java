package Questions;

import java.util.Scanner;

public class Binary_to_Decimal {
    static void main(String[] args) {
        System.out.println("(ٱلسَّلَامُعَلَيْكُمْ)ُ");
        System.out.println("Enter the Binary value :- ");
        Scanner sc = new Scanner(System.in);
        long Binary = sc.nextLong();
        boolean condition = true;
        long Decimal = 0;
        int i  = 1;
        while (condition){
            long temp = Binary%10;
            Decimal = Decimal +  (temp * i);
            i = i*2;
            Binary =  Binary/10;
            if(Binary<=0){
                condition = false;
            }
        }
        System.out.println("Decimal value  :-  "+ Decimal);
    }
}
