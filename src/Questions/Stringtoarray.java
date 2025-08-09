package Questions;
import java.util.Scanner;
public class Stringtoarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:-   ");
        String si = s.nextLine();
        char[] arr = si.toCharArray();
        for (int i = 0 ; i < arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(arr[i]);
        }


    }
}
