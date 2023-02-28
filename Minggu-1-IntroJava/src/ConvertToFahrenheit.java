import java.util.Scanner;
public class ConvertToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan suhu c:");
        float c = input.nextFloat();
        float f=((c*9)/5)+32;
        System.out.println("Konvert dari "+c+"'C ke fahrenheit adalah "+f+"'F");
    }
}
