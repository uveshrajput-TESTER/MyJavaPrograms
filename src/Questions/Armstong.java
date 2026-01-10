package Questions;

import java.util.Scanner;
import java.lang.Math;
public class Armstong {
    static void main(String[] args) {
        System.out.println("(ٱلسَّلَامُعَلَيْكُمْ)ُ");
        System.out.print("Enter any +ve Integer :-   ");
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();
        int original =num;
        String Num = Integer.toString(num);
        int  digit = Num.length() ;
        int result = 0;
        boolean check = true;
        while (num>0){
            int Temp = num%10;
            Temp = (int) Math.pow(Temp,digit);
            result = result + (Temp);
            num = num/10;
        }
        if (result == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

    }
}
