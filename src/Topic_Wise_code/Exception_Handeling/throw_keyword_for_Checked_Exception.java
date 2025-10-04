package Topic_Wise_code.Exception_Handeling;

import java.io.FileNotFoundException;

public class throw_keyword_for_Checked_Exception {
    public static void main(String[] args) throws FileNotFoundException {
        int a = 5;
        if (a == 5){
            System.out.println("hi i am from if ");
            throw new FileNotFoundException();

        }else {
            System.out.println("hi i am from else ");
        }
    }
}
