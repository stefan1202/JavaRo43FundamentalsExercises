package ro.sda.javaro43.iterations;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionModifications {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ana");
        list.add("are");
        list.add("mere");
        for (String s:list){
            System.out.println(s);
//            list.remove(s);
        }

        for (Iterator<String> i =list.iterator(); i.hasNext();){
            String value = i.next();
            if ("Ana".equalsIgnoreCase(value)){
                i.remove();
            } else {
                System.out.println(value);
            }

        }
        System.out.println(list);
    }
}
