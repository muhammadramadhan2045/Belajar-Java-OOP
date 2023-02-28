import java.util.Scanner;

public class GroupOfChar {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        char kar;
        System.out.print("Masukkan karakter\t: ");
        kar=inp.next().charAt(0);

            if(kar>=65 && kar<=90)
                System.out.print(kar+" adalah Huruf Besar");
            else if(kar>=97 && kar<=122)
                System.out.print(kar+" adalah Huruf Kecil");
            else if(kar>=48 && kar<=57)
                System.out.print(kar+" adalah Angka");
            else
                System.out.print(kar+" adalah Simbol");


    }
}
