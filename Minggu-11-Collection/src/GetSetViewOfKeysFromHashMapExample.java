import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class GetSetViewOfKeysFromHashMapExample {
    public static void main(String[] args) {
        //create HashMap object
        HashMap hMap=new HashMap();

        //add key value pairs to HashMap
        hMap.put("1","One");
        hMap.put("2","Two");
        hMap.put("3","Three");

        Set st=hMap.keySet();
        System.out.print("Set created from HashMap Keys contains : ");
        //iterate through the Set of keys
        Iterator itr= st.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next());
        }
        //remove 2 from set
        st.remove(2);
    }
}
