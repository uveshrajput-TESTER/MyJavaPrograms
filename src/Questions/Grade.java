package Questions;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("WELCOME TO UVESH GRADE GENERATOR");
        System.out.println("Please Enter your Marks");
        int marks = obj.nextInt();
        if (marks >= 80)
            System.out.println("You Score Grade A");
        else if (marks >= 60 )
            System.out.println("You Score Grade B");
        else if (marks >= 40)
            System.out.println("You Score Grade  C");
        else
            System.out.println("You Are Fail");

        }

    }


