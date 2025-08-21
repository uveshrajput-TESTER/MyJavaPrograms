package Questions;

import java.util.Random;
import java.util.Scanner;

public class guessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random  rnd = new Random();
        int count = 0;
        System.out.println("******* WELCOME TO THE NUMBER GUESSING GAME ********");
        System.out.println("Guess the Number from 1 to 100 ");
        int number = sc.nextInt();
        int Random = rnd.nextInt(100)+1;
        for (int i = 100;i > 5;) {
            if (number<=0 || number>100){
                System.out.println("please insert valid input");
                break;
            }else {
            if (number == Random) {
                count++;
                System.out.println("Hurray you Guess the wright Number");
                System.out.println("the steps to found the Number is " + count);
                break;
            }
            else if (number>Random) {
                count++;
                System.out.println("The number you given is greater than the Number ");
                System.out.println("Guess the Number Again  ");
                System.out.println();
                number = sc.nextInt();
            }
            else if (number<Random){
                count++;
                System.out.println("The number you given is  Smaller than the  Number");
                System.out.println("Guess the Number Again  ");
                System.out.println();
                number = sc.nextInt();

            } }

        }
    }
}
