package Topic_Wise_code.Exception_Handeling;

public class nested_try_block {
    public static void main(String[] args) {
        try{//try block 1
            try{//try block 2
                int a12 = 12/0;
                try{//try block 3
                    int a[] = {1,2,3,4};
                    System.out.println(a[5]);
                }catch (NullPointerException ne){
                    System.out.println("try block 3");
                    System.out.println("NullPointerException"+ ne );
                }
            }catch(ArithmeticException ae){
                System.out.println("try block 2");
                System.out.println("ArithmeticException"+ae);
            }
        }catch(Exception e){
            System.out.println("try block 1");
            System.out.println("Error is found :- "+e);

    }
    }
}
