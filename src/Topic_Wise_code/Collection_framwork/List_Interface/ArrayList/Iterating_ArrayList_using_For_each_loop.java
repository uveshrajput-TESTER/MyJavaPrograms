package Topic_Wise_code.Collection_framwork.List_Interface.ArrayList;

import java.util.ArrayList;

public class Iterating_ArrayList_using_For_each_loop {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Uvesh");
        list.add("20");
        list.add("20.034");
        list.add("A");
        for(String Values : list){
            System.out.println("List item is --->"+Values);
        }


    }
}
