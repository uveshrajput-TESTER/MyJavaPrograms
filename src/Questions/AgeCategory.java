package Questions;

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your Age :- ");
        int age = obj.nextInt();
        if (age>=0 && age<=12)
            System.out.println("child");
        else if (age>12 && age<=19)
            System.out.println("Teen");
        else if (age>19 && age<=64)
            System.out.println("Adult");
        else if(age>64 && age<120)
            System.out.println("Senior");
        else
            System.out.println("Tu jinda kese he ");
    }
}
