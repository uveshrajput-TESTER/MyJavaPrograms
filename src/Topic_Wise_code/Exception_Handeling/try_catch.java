package Topic_Wise_code.Exception_Handeling;
import java.util.Scanner;
//One of the primary mechanisms for handling exceptions in Java is the try-catch block. The try block contains the code that may throw an
//exception, and the catch block is used to handle the exception if it occurs. Here's a basic example:
public class try_catch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any positive Integer:-  ");
        int a = sc.nextInt();
        System.out.println("Enter Any positive Integer:-  ");
        int b = sc.nextInt();
        try{
            System.out.println("In the Try block");
            int Division = a/b;
            System.out.println("after the Division The Answer of sum is :-"+ Division);
        }
        catch(Exception e){
            System.out.println("the Error is occurred :-  "+ e);
        }
        System.out.println("After the Exception");
    }
}
