public class MultiTabungan {
    private int saldo;
    private int pilihan;
    public MultiTabungan(int select,int Saldo) {
        if(select==2)
            this.saldo=Saldo*9000;
        else if(select==3)
            this.saldo=Saldo*10000;
        else
            this.saldo=Saldo;
        this.pilihan=select;
    }
    public int getSaldo() {

        return this.saldo;
    }
    public void simpanUang(int select,int jumlah){

        if(select==2)
            this.saldo+=jumlah*9000;
        else if(select==3)
            this.saldo+=jumlah*10000;
        else
            this.saldo+=jumlah;

    }
    public boolean ambilUang(int select,int jumlah){
        if(select==2) {
            if (this.saldo < jumlah*9000)
                return false;
            else {
                this.saldo -= jumlah*9000;
                return true;
            }
        }
        if(select==3) {
            if (this.saldo < jumlah*10000)
                return false;
            else {
                this.saldo -= jumlah*10000;
                return true;
            }
        }
        else {
            if (this.saldo < jumlah)
                return false;
            else {
                this.saldo -= jumlah;
                return true;
            }
        }
    }
}