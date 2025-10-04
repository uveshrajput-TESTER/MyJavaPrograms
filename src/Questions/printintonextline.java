package Questions;

import java.util.*;

public class printintonextline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number greater than Zero and less than 50  :- ");
        int num = sc.nextInt();
        aa:
        for (int i = 1;i<=10;i++){
            bb:
            for (int j=1;j<=(num%10);j++){
                if(j<num){
                    System.out.println(j);
                } else if (j==num) {
                    System.out.println(j);
                    break aa;
                }
                
            }
        }
    }
}
