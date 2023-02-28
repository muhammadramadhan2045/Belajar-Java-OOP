import java.util.Locale;

public class Str6 {
    public static void main(String[] args) {
        String s1="HELLO WORLD";
        String s2="hello world";
        if(s2.equals(s1.toLowerCase(Locale.ROOT))){
            System.out.println("Lowercase string s1 is equal to string s2");
        }
    }
}
