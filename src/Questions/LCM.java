package Questions;

public class LCM {
    static void main(String[] args) {
        int a = 6;
        int b = 757;

        int start = Math.max(a, b);   // bigger number se start
        int lcm = start;

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println("LCM is: " + lcm);
                break;
            }
            lcm += start;   // next multiple of bigger number
        }
//        int num1 = 6;
//        int num2 = 18 ;
//        int[] num1multi = new int[10];
//        int[] num2multi = new int[10];
//        for (int i = 1; i <=10 ; i++) {
//            num1multi[i-1]= num1 *i;
//        }
//        for (int i = 1; i <=10 ; i++) {
//            num2multi[i-1]= num2 *i;
//        }
//        aa:
//        for (int i = 0; i <(num1multi.length-1) ; i++) {
//            for (int j = 0; j <(num2multi.length-1) ; j++) {
//                if(num1multi[i]==num2multi[j]){
//                    System.out.println("LCM is :- " + num1multi[i] );
//                    break aa;
//                };
//            }

        }
    }


