package Questions;

import java.util.Scanner;

//Write a program to check if a year is a leap year using nested if statements.
public class leap_Year {
    public static void main(String[] args) {
        System.out.println("Enter Any Year");
        Scanner   sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year%100 == 0){
            System.out.println(year + "  is Not A Leap Year");
        }else {
            if((year%4 == 0)||(year%400 == 0)){
                System.out.println(year + "  is A Leap Year ");
            }
        }

    }
}
