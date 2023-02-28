import perbankan.*;
public class TestLatihan {
    public static void main(String[] args) {
        boolean status;
        int temp;
        Nasabah nasabah =new Nasabah("Agus","Daryanto");
        System.out.println("Nasabah atas nama "+nasabah.getNamaAwal()+" "+nasabah.getNamaAkhir());
        nasabah.setTabungan(new Tabungan(5000));
        temp=nasabah.getTabungan().getSaldo();
        System.out.println("Saldo awal : "+temp);
        nasabah.getTabungan().simpanUang(3000);
        System.out.println("Jumlah uang yang disimpan : 3000");
        status=nasabah.getTabungan().ambilUang(6000);
        System.out.println("Jumlah uang yang diambil : 6000");
        if(status==true)
            System.out.println("Ok");
        else
            System.out.println("Gagal");
        nasabah.getTabungan().simpanUang(3500);
        System.out.println("Jumlah uang yang disimpan : 3500");
        status=nasabah.getTabungan().ambilUang(4000);
        System.out.println("Jumlah uang yang diambil : 4000");
        if(status==true)
            System.out.println("Ok");
        else
            System.out.println("Gagal");
        status=nasabah.getTabungan().ambilUang(1600);
        System.out.println("Jumlah uang yang diambil : 1600");
        if(status==true)
            System.out.println("Ok");
        else
            System.out.println("Gagal");
        nasabah.getTabungan().simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan : 2000");
        temp=nasabah.getTabungan().getSaldo();
        System.out.println("Saldo sekarang = "+temp);

    }
}
