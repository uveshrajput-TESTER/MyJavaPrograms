package Topic_Wise_code.Exception_Handeling;

public class finally_block {
    public static void main(String[] args) {
        System.out.println("Welcome to the Code");
        int a = 12;
        int b = 0;
        try{
            int division = a/b;
            System.out.println("the output of division is :- ");
        }catch(Exception e){
            System.out.println("The Error is :- "+ e);
        }finally {
            System.out.println("i am inside the finally block that's why i am always execute");
        }
        System.out.println("The program is End ");
    }
}
