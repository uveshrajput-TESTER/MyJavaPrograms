package Questions;

import java.util.Scanner;

public class evenorodd {
    static void main(String[] args) {
        System.out.println("Enter the Integer Number  :-");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2 == 0 ){
            System.out.println("Even ");
        }else {
            System.out.println("Odd");
        }
    }
}
