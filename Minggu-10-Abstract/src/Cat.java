import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class CobaList {
    public static void main(String[] x) {
        List<String> lis = new ArrayList<String>();
// Masukkan value ke dalam lis
        lis.add("dani");
        lis.add("Budi");
        lis.add("Buaya");
        abstract class Biodata {
            abstract void mData(String nama, String ttl);
        }
        public class Implementasi extends Biodata {
…
        }
        public class Abstraction{
            public static void main(String[] args){
…
            }
        }
        lis.add("ANDRI");
        lis.add("yuliana");
// Tampilkan value lis
        for (Iterator<String> iterator = lis.iterator(); iterator.hasNext();)
        {
            String string = (String) iterator.next();
            System.out.println(string);
        }
    }
}