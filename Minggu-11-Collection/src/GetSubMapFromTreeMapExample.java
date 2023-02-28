import java.util.SortedMap;
import java.util.TreeMap;

public class GetSubMapFromTreeMapExample {
    public static void main(String[] args) {
        //create TreeMap object
        TreeMap treeMap=new TreeMap();

        //add key value pairs to TreeMap
        treeMap.put("1","One");
        treeMap.put("2","Two");
        treeMap.put("3","Three");
        treeMap.put("5","Five");
        treeMap.put("4","Four");

        SortedMap sortedMap =treeMap.subMap("2","5");
        System.out.println("SortedMap contains : "+sortedMap);
    }
}
