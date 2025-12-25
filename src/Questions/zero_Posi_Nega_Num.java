package Questions;

import java.util.Scanner;

public class zero_Posi_Nega_Num {
//    Write a program to check if a number is positive, negative, or zero using if-else statements.
public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enater Any Integer");
    int a = Sc.nextInt();

    if (a==0){
        System.out.println("The Number is Zero ");
    }else if (a>0){
        System.out.println("The Number is Positive ");
    }else {
        System.out.println("Negative Number");
    }

}
}
