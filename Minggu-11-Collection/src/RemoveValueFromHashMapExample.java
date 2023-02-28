
import java.util.HashMap;

public class RemoveValueFromHashMapExample {
    public static void main(String[] args) {
        //create HashMap object
        HashMap hMap=new  HashMap();

        //add key value pairs to HashMap
        hMap.put("1","One");
        hMap.put("2","Two");
        hMap.put("3","Three");
        Object obj=hMap.remove(2);
        System.out.println(obj+" Removed from HashMap");
        hMap.clear();

        System.out.println("Total key value pairs in HashMap are : "+hMap.size());
    }
}

