import java.util.Scanner;

public class ByteToBiner {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        byte x;
        System.out.print("Masukan Decimal\t: ");
        x= inp.nextByte();
        String binNumber =Integer.toBinaryString(x);
        System.out.print("Biner\t: "+binNumber);

    }
}
