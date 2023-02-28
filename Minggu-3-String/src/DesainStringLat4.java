import java.util.Locale;
import java.util.Scanner;

public class DesainStringLat4 {
    public static void main(String[] args) {
        String jawab;
        int pilih;
        String kal="Selamat Datang di PENS";
        Scanner inp=new Scanner(System.in);
        do{
            System.out.println("Kalimat yang dipakai :"+kal);
            System.out.println("Masukan pilihan");
            System.out.println("1.Konvert menjadi huruf Kapital");
            System.out.println("2.Panjang Kalimat");
            System.out.println("3.Indeks 'PENS'");
            System.out.print("pilih mana?");
            pilih=inp.nextInt();
            switch(pilih){
                case 1:
                    System.out.println(kal.toUpperCase(Locale.ROOT));
                    break;
                case 2:
                    System.out.println(kal.length());
                    break;
                case 3:
                    System.out.println(kal.indexOf("PENS"));
                    break;
                default:
                    System.out.println("Salah pilih bro");
            }
            System.out.print("Mau lagi ?");
            jawab=inp.next();
        }while(jawab.charAt(0)!='t');
    }
}
