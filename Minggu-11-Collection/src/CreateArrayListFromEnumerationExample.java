import java.util.*;

public class CreateArrayListFromEnumerationExample {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        v.add("F");
        System.out.println("Vector contains: "+v);
        Enumeration e=v.elements();
        ArrayList aList= Collections.list(e);
        System.out.println("Arraylist contains: "+aList);
    }
}
