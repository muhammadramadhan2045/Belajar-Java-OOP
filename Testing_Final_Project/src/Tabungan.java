public class Tabungan {
    private int saldo;
    private int transfer;
    private String info="Terima kasih telah menabung & melakukan transaksi";
    Tabungan(){
        info();
    }
    public Tabungan(int saldo){

        this.saldo=saldo;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public int getTranfer() {
        return transfer;
    }

    public void simpanUang(int jumlah){

        this.saldo+=jumlah;
    }
    public boolean ambilUang(int jumlah){
        if(this.saldo<jumlah)
            return false;
        else{
            this.saldo-=jumlah;
            this.transfer=jumlah;
            return true;
        }
    }

    public String info(){
        return info;
    }
}