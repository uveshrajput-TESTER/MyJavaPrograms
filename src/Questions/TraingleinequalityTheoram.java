package Questions;

import java.util.Scanner;

public class TraingleinequalityTheoram {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the First Side of Triangle :-  " );
        int first = obj.nextInt();
        System.out.println("Enter the Second Side of Triangle :-  " );
        int Second = obj.nextInt();
        System.out.println("Enter the Third Side of Triangle :-  " );
        int Third = obj.nextInt();
        if (first+Second > Third && Second + Third > first && Third + first > Second)
            System.out.println("Triangle can be Possible");
        else
            System.out.println("triangle can not be possible");

    }
}
