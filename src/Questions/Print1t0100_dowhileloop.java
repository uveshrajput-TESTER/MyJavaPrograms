package Questions;

public class Print1t0100_dowhileloop {
//    Write a program to find the sum of numbers from 1 to 100 using a do-while loop.
    public static void main(String[] args) {
     int sum = 0;
     int i = 1;
     do {
        sum = sum + i;
         System.out.println(sum + "   " + i);
        i++;
     }while (i<=100);
     System.out.println(sum + " :-  of 1 to 100 numbers");
    }
}
