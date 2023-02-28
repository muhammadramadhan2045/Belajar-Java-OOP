import java.awt.*;

public class CompareTest {
    public static void main(String[] args) {
        Button b= new Button("Exit");
        boolean compare1 = b instanceof Button;
        boolean compare2 = b instanceof Component;
        System.out.println("Is a Button ?" + compare1);
        System.out.println("Is b  a Component ?" + compare2);

    }
}
