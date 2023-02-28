import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //limit jumlah dari index
        int limit;
        Scanner inp= new Scanner(System.in);
        System.out.print("Mau berpa seri :");
        limit=inp.nextInt();

        int[] seri = new int[limit];

        //isi memang indeks 0 dan 1
        seri[0] = 1;
        seri[1] = 1;

        //buat bilangan fibonacci seri dari i =2
        for(int i=2; i < limit; i++){
            seri[i] = seri[i-1] + seri[i-2];
        }

        //print seri fibonaci
        System.out.println("Deret Fibonacci " + limit);
        for (int i = 0; i < limit; i++) {
            System.out.print(seri[i] + " ");
        }
    }
}
