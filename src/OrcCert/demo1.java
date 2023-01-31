package OrcCert;

import OrcCert.function.ex1;

import java.util.ArrayList;
import java.util.List;

public class demo1 {
   String  a ="a";

   public void show(String a){
       String s =a;
       System.out.println(s);
       System.out.println(a);
   }

    public static void main(String[] args) {
       List<String> listStr = List.of("1","123","12324");
        ex1 ex1 = new ex1();
        ex1.convertToListInt(listStr);
        System.out.println(listStr);
    }
}
