import java.util.HashSet;
import java.util.Hashtable;
import java.util.NoSuchElementException;
import java.util.Set;

public class NoSuch {
    public static void main(String[] args) {
        Set exampleleSet = new HashSet();
        Hashtable exampleTable = new Hashtable();
        try {
            exampleleSet.iterator().next();                         //This throws NoSuchElementException
            exampleTable.elements().nextElement();
        }catch (NoSuchElementException n){
            System.out.println("Error : "+n);
        }
    }
}