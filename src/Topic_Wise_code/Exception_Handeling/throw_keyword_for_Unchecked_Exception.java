package Topic_Wise_code.Exception_Handeling;

public class throw_keyword_for_Unchecked_Exception {
    public static int age(int a,int b){
        if (b==0){
            throw new ArithmeticException("division by zero is not accepted") ;
        }else {
            return (a/b);
        }
    }
    public static void main(String[] args) {
        int division = age(5,0);
        System.out.println(division);
    }
}
