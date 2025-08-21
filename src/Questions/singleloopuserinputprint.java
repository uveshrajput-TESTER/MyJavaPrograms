package Questions;

import java.util.Scanner;

public class singleloopuserinputprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First integer Value:-   ");
        int First = sc.nextInt();
        System.out.println("Enter the Second integer Value:-   ");
        int Second = sc.nextInt();
        int sum = First+Second;
        for (int i = 1;i<=sum;i++){
            if (i<=First){
                 System.out.println(i);}
            else{
                System.out.println(Second);
                Second--;}


        }


    }
}
