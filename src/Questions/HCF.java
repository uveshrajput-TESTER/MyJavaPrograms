package Questions;

public class HCF {
    static void main(String[] args) {
//        HCF Of Two Numbers Program
    int num1  = 166 ;
    int num2 = 16;
    int maxnum = num2;
    if (num1>num2) {
     maxnum = num1;
    }
    int maxf = 0;
        for (int i = 1; i <=maxnum ; i++) {
            if(num1%i == 0 && num2%i == 0){
                if (maxf<i){
                    maxf = i ;
                }
            }
        }
        System.out.println("HCF is  :- "+ maxf);
    }
}
