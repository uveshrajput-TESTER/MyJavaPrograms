package Topic_Wise_code.Exception_Handeling;

import java.util.Scanner;

public class Custom_Exception {
    public static void checkage(int a) throws InvalidAgeException_Checked_Exceptions {
        if (a<18){
            throw new InvalidAgeException_Checked_Exceptions("You are not eligible ");
        }else {
            System.out.println("You are Eligible ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO BEER BAR CORNER");
        System.out.println("Enter Your Age : ");
        int age = sc.nextInt();
        try{checkage(age);}
        catch(InvalidAgeException_Checked_Exceptions in){
            System.out.println("The Error is Occurred :- "+in.getMessage());
        }
        System.out.println("Enter your name :-");
        String name = sc.next();
        System.out.println("Your name is "+ name);
    }
}
