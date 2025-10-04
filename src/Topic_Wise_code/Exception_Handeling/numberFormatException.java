package Topic_Wise_code.Exception_Handeling;

public class numberFormatException  {
    public static void main(String[] args) {
        try {
            String s="abc";
            int i=Integer.parseInt(s);//NumberFormatException
            System.out.println("Parsed number: " + i);
        }catch (NumberFormatException e){
            System.out.println("Error: Unable to parse the string as an integer.");
        }
    }
}
