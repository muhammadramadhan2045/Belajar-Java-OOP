public class Tabungan1 {
    public int saldo;

    Tabungan1(int Saldo) {
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
