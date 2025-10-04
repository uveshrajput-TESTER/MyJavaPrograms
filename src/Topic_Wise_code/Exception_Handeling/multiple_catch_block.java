package Topic_Wise_code.Exception_Handeling;

import java.util.Scanner;

public class multiple_catch_block {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any positive Integer:-  ");
        int a = sc.nextInt();
        System.out.println("Enter Any positive Integer:-  ");
        int b = sc.nextInt();
        try{
            System.out.println("In the Try block");
            int Division = a/b;
            int[] a1  = new int[5];
            System.out.println(a1[6]);
            String a2 = null ;
            System.out.println(a2.length());
            System.out.println("after the Division The Answer of sum is :-"+ Division);
        }
        catch (ArithmeticException ae){
            System.out.println("the Error is occurred :-  "+ ae);
        }catch (NullPointerException ne){
            System.out.println("the Error is occurred :-  "+ ne);
        }catch (ArrayIndexOutOfBoundsException aie){
            System.out.println("the Error is occurred :-  "+ aie);
        }
        System.out.println("After the Exception");
    }
}
