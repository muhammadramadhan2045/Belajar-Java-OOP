import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {
        int i = 0;
        //int j = 0;
        int bil;
        int temp1=1,temp2=0;
        int jumlah=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan deret fibbonaci\t: ");
        bil = inp.nextInt();
        for(i=0;i<bil;i++){
            jumlah=temp1+temp2;
            System.out.print(" "+jumlah);
            temp1=temp2;
            temp2=jumlah;
        }

    }
}
