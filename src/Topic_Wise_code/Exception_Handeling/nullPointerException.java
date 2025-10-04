package Topic_Wise_code.Exception_Handeling;

public class nullPointerException {
    public static void main(String[] args) {
        String a = "uvesh";
        String a1 = null ;
        try {
            System.out.println(a.length());
            System.out.println(a1.length());
        }catch(java.lang.NullPointerException e ){
            System.out.println("Error: Null reference encountered.");
        }
        }
}
