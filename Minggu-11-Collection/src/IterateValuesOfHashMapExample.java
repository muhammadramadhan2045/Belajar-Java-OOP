import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class IterateValuesOfHashMapExample {
    public static void main(String[] args) {
        //create HashMap object
        HashMap hMap=new HashMap();

        //add key value pairs  HashMap
        hMap.put("1","One");
        hMap.put("2","Two");
        hMap.put("3","Three");

        Collection c=hMap.values();
        //obtain an iterator for Collection
        Iterator itr=c.iterator();

        //iterate through HashMap values iterator
        while(itr.hasNext()) {
            System.out.print(itr.hasNext());
        }
    }
}
