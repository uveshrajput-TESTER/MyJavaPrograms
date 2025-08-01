package Questions;

import java.util.Scanner;

public class Arrayprint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Please Enter the First value of Array:  ");
        array[0] = scanner.nextInt();
        System.out.println("Please Enter the second value of Array:  ");
        array[1] = scanner.nextInt();
        System.out.println("Please Enter the Third value of Array:  ");
        array[2] = scanner.nextInt();
        System.out.println("Please Enter the Fourth value of Array:  ");
        array[3] = scanner.nextInt();
        System.out.println("Please Enter the Fifth value of Array:  ");
        array[4] = scanner.nextInt();
        for (int i: array)
            System.out.println(i);



    }
}
