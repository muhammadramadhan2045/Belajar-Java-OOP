import java.util.Scanner;
public class LuasLingkaran {
    public static void main(String[] args) {
        float phi=3.14F;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan r : ");
        float r = input.nextFloat();
        System.out.println("Luas lingkran :" +phi*r*r);
        System.out.println("Luas lingkran :" +2*phi*r);

    }
}
