package Questions;
//Write a program to find the sum of all diagonals in a 2D array (matrix).
public class Daignal_Sum {
    public static void main(String[] args) {
        int[][] num = new int[3][3];
//        Adding Values to the 2D Array
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = j;
                System.out.println("num[" + i + "]" + "[" + j + "]" + "  ----->   " + num[i][j]);
            }
        }
        int sum = 0;
//        Sum of Daignal Values
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (i == j) {
                    sum = sum + num[i][j];
                }
            }}

//       Sum of Anti  Daignal Values
            for (int ii = 0; ii < num.length; ii++) {
                for (int jj = (num[ii].length - 1); jj >= 0; jj--) {
                    if ((ii + jj) == (num.length -1)) {
                        sum = sum + num[ii][jj];
                    }
                }
            }
            System.out.println(sum);


    }}
