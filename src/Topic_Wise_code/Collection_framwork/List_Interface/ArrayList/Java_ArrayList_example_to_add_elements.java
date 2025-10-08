package Topic_Wise_code.Collection_framwork.List_Interface.ArrayList;

import java.util.ArrayList;

public class Java_ArrayList_example_to_add_elements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        //Adding elements to the end of the list
        list.add("Uvesh");
        list.add("sabir");
        list.add("imraan");
        list.add("ayaan");
        System.out.println("After invoking add(E e) method: "+list);

        //Adding an element at the specific position
        list.add(1,"junaid");
        System.out.println("After invoking add(int index, E element) method: "+list);

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("chattan");
        list1.add("jishan");
        list1.add("tausiif");
        list1.add("saif");
        //Adding second list elements to the first list
        list.addAll(list1) ;
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+list);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("rihan");
        list2.add("kaashif");
        list2.add("abdul");
        //Adding second list elements to the first list at specific position
        list.addAll(0, list2);
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+list);

    }
}
