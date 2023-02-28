import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        int year;
        Scanner inp= new Scanner(System.in);
        System.out.print("Masukkan tahun (1900-2005)\t: ");
        year= inp.nextInt();
        if(year>2005){
            System.out.println("Maaf, tahun yang diinput diatas 2005");
        }
        else if(year<1900){
            System.out.println("Maaf, tahun yang diinput dibawah 1900");
        }
        else{
            if(year%400==0 || year%100==0 || year%4==0)
                System.out.println(year+" adalah tahun kabisat");
            else
                System.out.println(year+" adalah bukan tahun kabisat");
        }

    }
}
/*Terdapat algoritme mudah untuk menentukan apakah suatu tahun termasuk tahun kabisat atau bukan sebagai berikut:

Jika angka tahun itu habis dibagi 400, maka tahun itu sudah pasti tahun kabisat.
Jika angka tahun itu tidak habis dibagi 400 tetapi habis dibagi 100, maka tahun itu sudah pasti bukan merupakan tahun kabisat.
Jika angka tahun itu tidak habis dibagi 400, tidak habis dibagi 100 akan tetapi habis dibagi 4, maka tahun itu merupakan tahun kabisat.
Jika angka tahun tidak habis dibagi 400, tidak habis dibagi 100, dan tidak habis dibagi 4, maka tahun tersebut bukan merupakan tahun kabisat.*/