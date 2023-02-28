public class Tabungan {
    public int saldo;
    Tabungan(int Saldo){
        this.saldo= Saldo;
     }
    public void ambilUang(int jumlah){

        this.saldo-=jumlah;
    }
}

