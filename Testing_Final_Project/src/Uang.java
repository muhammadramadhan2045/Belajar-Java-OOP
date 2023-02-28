public class Uang extends Tabungan {
    private int proteksi;
    private String info="Selamat datang, Tabung uangmu, Demi masa depanmu";
    public Uang(){
        info();
    }
    public Uang(int saldo) {
        super(saldo);
    }
    public Uang(int saldo,int tingkatBunga) {
        super(saldo-tingkatBunga);
        this.proteksi=tingkatBunga;
    }

    @Override
    public int getSaldo() {
        return super.getSaldo()+this.proteksi;
    }

    @Override
    public boolean ambilUang(int jumlah) {
        return super.ambilUang(jumlah);
    }

    @Override
    public int getTranfer() {
        return super.getTranfer();
    }

    @Override
    public void simpanUang(int jumlah) {
        super.simpanUang(jumlah);
    }

    public String info() {
            return info;
    }

}