package perbankan;
public class Tabungan {
    public int saldo=5000;
    public Tabungan(int Saldo){

        this.saldo=Saldo;
    }

    public int getSaldo() {
        return this.saldo;
    }
    public void simpanUang(int jumlah){

        this.saldo+=jumlah;
    }
    public boolean ambilUang(int jumlah){
        if(this.saldo<jumlah)
            return false;
        else{
            this.saldo-=jumlah;
            return true;
        }
    }
}
