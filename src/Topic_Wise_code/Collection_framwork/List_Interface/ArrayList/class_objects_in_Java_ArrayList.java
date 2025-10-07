package Topic_Wise_code.Collection_framwork.List_Interface.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class class_objects_in_Java_ArrayList {
    public static void main(String[] args) {
     Student s1 = new Student("Uvesh",1,20);
     Student s2 = new Student("Sabir",2,19);
     Student s3 = new Student("imraan",3,20);
     Student s4 = new Student("Aasif",4,24);

        ArrayList<Student> slist = new ArrayList<Student>();
        slist.add(s1);
        slist.add(s2);
        slist.add(s3);
        slist.add(s4);
        Iterator<Student> itr = slist.iterator();
        while(itr.hasNext()){
            Student str = (Student)itr.next();
            System.out.println(str.rollno+" "+str.name+" "+str.Age);
        }

    }
}
