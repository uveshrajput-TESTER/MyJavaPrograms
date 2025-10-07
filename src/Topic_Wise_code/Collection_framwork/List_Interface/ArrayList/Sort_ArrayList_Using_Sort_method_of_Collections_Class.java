package Topic_Wise_code.Collection_framwork.List_Interface.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Sort_ArrayList_Using_Sort_method_of_Collections_Class {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Uvesh");
        list.add("Sabir");
        list.add("Chattaan");
        list.add("Aasif");
        System.out.println("Before Sorting");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After Sorting");
        System.out.println(list);
        System.out.println("Sort Integers");
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(132);
        num.add(32);
        num.add(123);
        num.add(102);
        num.add(192);
        num.add(101);
        System.out.println("Before Sorting");
        System.out.println(num);
        Collections.sort(num);
        System.out.println("After Sorting");
        System.out.println(num);
    }
}
