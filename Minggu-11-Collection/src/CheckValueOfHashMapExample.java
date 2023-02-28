
import java.util.HashMap;


public class CheckValueOfHashMapExample {
    public static void main(String[] args) {
        //create HashMap object
        HashMap hMap=new HashMap();

        //add key value pairs to HashMap
        hMap.put("1","One");
        hMap.put("2","Two");
        hMap.put("3","Three");

        boolean blnExists=hMap.containsValue("Two");

        System.out.println("Two exists in HashMap?: "+blnExists);
    }
}
