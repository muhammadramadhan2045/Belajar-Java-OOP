import java.util.Scanner;
public class DifferentTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ja,ma;
        int jakh,makh;
        int menit1,menit2;
        //ma itu = menit awal
        //ja itu = jam awal
        //menit1 = untuk konversi ke menit waktu awal
        //menit2 = untuk konversi ke menit waktu akhir

        System.out.print("Masukan jam awal\t: ");
        ja=input.nextInt();

        System.out.print("Masukan menit awal\t:");
        ma= input.nextInt();
        menit1=(ja*60)+ma;

        System.out.print("Masukan jam akhir\t: ");
        jakh=input.nextInt();

        System.out.print("Masukan menit akhir\t:");
        makh= input.nextInt();
        menit2=(jakh*60)+makh;

        System.out.println("Waktu pertama adalah "+ja+":"+ma);
        System.out.println("Waktu pertama adalah "+jakh+":"+makh);
        System.out.println("Durasi waktu (dalam menit) antara "+ja+":"+ma+" dengan "+ jakh+":"+makh+" adalah "+(menit2-menit1)+" menit");

    }
}
