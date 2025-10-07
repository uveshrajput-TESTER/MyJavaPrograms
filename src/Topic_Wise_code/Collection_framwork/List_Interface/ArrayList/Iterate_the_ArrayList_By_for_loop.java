package Topic_Wise_code.Collection_framwork.List_Interface.ArrayList;

import java.util.ArrayList;

public class Iterate_the_ArrayList_By_for_loop {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Uvesh");
        list.add("Sabir");
        list.add("Chattaan");
        list.add("Aasif");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
