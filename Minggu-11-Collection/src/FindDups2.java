import java.util.HashSet;
import java.util.Set;

public class FindDups2 {
    public static void main(String[] args) {
        Set<String> uniques=new HashSet<String>();
        Set<String> dups=new HashSet<String>();


        uniques.add("Bernadine");
        uniques.add("Elizabeth");
        uniques.add("Gene");
        uniques.add("Elizabeth");
        uniques.add("Clara");


        dups.add("Elizabeth");
        dups.add("Gene");
        dups.add("Elizabeth");
        dups.add("Clara");

        for(String a : args)
            if(!uniques.add(a))
                dups.add(a);
         //Destructive set-difference
        uniques.removeAll(dups);

        System.out.println("Uniques words : "+uniques);
        System.out.println("Duplicate words : "+dups);
    }
}
