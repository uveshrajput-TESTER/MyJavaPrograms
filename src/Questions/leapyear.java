package Questions;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("Enter the Year :- ");
        int year = o.nextInt();
        if((year%4 == 0)||(year%400 == 0))
            System.out.println("THIS is the Leap Year");
        else
            System.out.println("This is not a leap year ");
}}
