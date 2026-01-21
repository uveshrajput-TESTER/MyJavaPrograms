package Questions;

public class Factorials {
    static void main(String[] args) {
        int num  = 4;
        int factorials =1 ;
        for (int i = 1; i <=num ; i++) {
         factorials = factorials * i ;
        }
        System.out.println(factorials);
    }
}
