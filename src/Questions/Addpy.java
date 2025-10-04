package Questions;

import java.util.*;

public class Addpy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.next();
        if (st.charAt(0) == 'p'&&st.charAt(1)=='y')
            System.out.println(st);
        else
            System.out.println("py"+st);


    }
}
