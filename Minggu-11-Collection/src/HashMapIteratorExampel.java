import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIteratorExampel {
    public static void main(String[] args) {
        //create HashMap of int keys and String values
        HashMap<Integer,String>hMap=new HashMap<Integer,String>();

        //add key value pairs to HashMap
        hMap.put(1,"One");
        hMap.put(2,"Two");
        hMap.put(3,"Three");

        //Getting a Set of Key-value pairs
        Set entrySet=hMap.entrySet();

        // Obtaining an iterator for the entry set
        Iterator it=entrySet.iterator();

        //Iterate through HashMap entries(Key-value pairs)
        System.out.println("HashMap Key-Value Pairs : ");
        while (it.hasNext()){
            Map.Entry me=(Map.Entry)it.next();
            System.out.println("Key is: "+me.getKey()+" & "+" value is : "+me.getValue());
        }


        System.out.println("Total key value pairs in HashMap are : "+hMap.size());
    }
}

