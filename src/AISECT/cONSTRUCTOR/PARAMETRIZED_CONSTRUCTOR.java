package AISECT.cONSTRUCTOR;

import java.io.StringBufferInputStream;

public class PARAMETRIZED_CONSTRUCTOR {
    String name ;
    String Gender ;
    Integer Age ;


    PARAMETRIZED_CONSTRUCTOR(String name,String Gender,Integer Age){
        this.name = name ;
        this.Gender = Gender;
        this.Age =Age;
        System.out.println("  Name "+this.name +"  Gender   "+ this.Gender +"    Age "+ this.Age);

    }

}
