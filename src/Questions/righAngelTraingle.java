package Questions;

import java.util.Scanner;

public class righAngelTraingle {
    public static void main(String[] args) {
        System.out.println("Please Enter the Number      :-    ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1;i<number+1;i++){
            System.out.println();
            for (int j = 1;j<=i;j++){
                System.out.print(j+" ");

            }

        }
    }
}
