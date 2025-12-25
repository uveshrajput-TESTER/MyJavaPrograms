package AISECT.Array;

import java.util.Arrays;

public class Remove_Duplicate {
//    Write a program to remove duplicate elements from an array.

    public static void main(String[] args) {
        int[] num = {1,4,5,3,5,3,5,3,5,3,5,7,5,4,7,3,4,7,8,9,0,2,6,9,0,2};
        int num2[] = new int[num.length];
        int k = 0 ;

        aa :
        for (int i = 0; i <num.length ; i++) {
            int search = num[i];
            boolean duplicate = false;
            bb :
            for (int j = 0; j <k ; j++) {
                if (num2[j]==search){
                    duplicate = true ;
                    break bb;
                }
            }
            if (!duplicate){
                num2[k] = search;
                k++ ;
            }
        }

        }

    }

