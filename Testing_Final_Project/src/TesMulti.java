import java.util.Scanner;

public class TesMulti {
    public static void main(String[] args) {
        boolean status;
        int select;
        int saldo;
        int tambahan;
        String jawab;
        Scanner inp=new Scanner(System.in);
        System.out.println("Pemasukan Saldo Awal");
        System.out.println("Pilih Mata Uang\n1. Rupiah\n2. USD\n3. AUD");
        System.out.print("Pilihan\t: ");
        select= inp.nextInt();
        System.out.print("Masukan saldo\t\t: ");
        saldo= inp.nextInt();

        System.out.print("Jumlah saldo Anda\t: " );
        if(select==1)
            System.out.println(saldo+" IDR");
        else if(select==2)
            System.out.println(saldo+" USD");
        else if(select==3)
            System.out.println(saldo+" AUD");

        MultiTabungan tabungan1 =new MultiTabungan(select,saldo);
        System.out.println("Saldo awal\t\t\t: "+tabungan1.getSaldo() +
                " IDR");

        System.out.print("\nApakah Anda ingin menabung  ? [y/t] ");
        jawab=inp.next();

        while (jawab.charAt(0)!='t'){
            System.out.println("Proses Menyimpan Uang");
            System.out.println("Pilih Mata Uang\n1. Rupiah\n2. USD\n3. AUD");
            System.out.print("Pilihan\t: ");
            select= inp.nextInt();
            System.out.print("Masukan jumlah uang yang ingin ditabung\t: ");
            tambahan=inp.nextInt();
            if(select==1)
                System.out.println("Jumlah uang yang disimpan\t: "+tambahan+" IDR");
            else if(select==2)
                System.out.println("Jumlah uang yang disimpan\t: "+tambahan+" USD");
            else if(select==3)
                System.out.println("Jumlah uang yang disimpan\t: "+tambahan+" AUD");
                        tabungan1.simpanUang(select,tambahan);
            System.out.print("Apakah Anda ingin menabung lagi ? [y/t] ");
            jawab=inp.next();
        }

        System.out.print("\nApakah Anda ingin mengambil uang Anda ? [y/t] ");
        jawab=inp.next();

        while (jawab.charAt(0)!='t'){
            System.out.println("Proses Mengambil Uang");
            System.out.println("Pilih Mata Uang\n1. Rupiah\n2. USD\n3. AUD");
                    System.out.print("Pilihan\t: ");
            select= inp.nextInt();
            System.out.print("Masukan jumlah uang yang ingin diambil\t: ");
            tambahan=inp.nextInt();
            if(select==1)
                System.out.println("Jumlah uang yang diambil\t: "+tambahan+" IDR");
            else if(select==2)
                System.out.println("Jumlah uang yang diambil\t: "+tambahan+" USD");
            else if(select==3)
                System.out.println("Jumlah uang yang diambil\t: "+tambahan+" AUD");
                        status=tabungan1.ambilUang(select,tambahan);
            if(status==true)
                System.out.println("Ok");
            else
                System.out.println("Gagal");
            System.out.println("Sisa Saldo\t: "+tabungan1.getSaldo() + " IDR");
            System.out.print("Apakah Anda ingin mengambil uang lagi ? [y/t] ");
            jawab=inp.next();
        }
        System.out.println("Jumlah Saldo\t: "+tabungan1.getSaldo() + " IDR");

    }
} 