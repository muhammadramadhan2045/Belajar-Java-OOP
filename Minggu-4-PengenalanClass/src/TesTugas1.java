public class TesTugas1 {
    public static void main(String[] args) {
        boolean status;
        Tabungan1 tabungan1 =new Tabungan1(5000);
        System.out.println("Saldo awal : "+tabungan1.getSaldo());
        tabungan1.simpanUang(3000);
        System.out.println("Jumlah uang yang disimpan : 3000");
        status=tabungan1.ambilUang(6000);
        System.out.println("Jumlah uang yang diambil : 6000");
        if(status==true)
            System.out.println("Ok");
        else
            System.out.println("Gagal");
        tabungan1.simpanUang(3500);
        System.out.println("Jumlah uang yang disimpan : 3500");
        status=tabungan1.ambilUang(4000);
        System.out.println("Jumlah uang yang diambil : 4000");
        if(status==true)
            System.out.println("Ok");
        else
            System.out.println("Gagal");
        status=tabungan1.ambilUang(1600);
        System.out.println("Jumlah uang yang diambil : 1600");
        if(status==true)
            System.out.println("Ok");
        else
            System.out.println("Gagal");
        tabungan1.simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan : 2000");
        System.out.println("Saldo sekarang = "+tabungan1.getSaldo());


    }
}
