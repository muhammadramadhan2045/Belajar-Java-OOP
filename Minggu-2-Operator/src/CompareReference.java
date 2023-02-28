import java.awt.*;

public class CompareReference {
    public static void main(String[] args) {
        Button a = new Button("Exit");
        Button b = new Button("Exit");
        Button c = a;
        System.out.println(a==b);
        System.out.println(a==c);
    }
}
