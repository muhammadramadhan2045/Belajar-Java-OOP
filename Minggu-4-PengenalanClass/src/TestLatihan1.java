public class TestLatihan1 {
    public static void main(String[] args) {
        Tabungan tabungan=new Tabungan(5000);
        System.out.println("Saldo : "+tabungan.saldo);
        tabungan.ambilUang(2300);
        System.out.println("Jumlah uang yang diambil :2300");
        System.out.println("Saldo selkarang : " +tabungan.saldo);

    }
}
