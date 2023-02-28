public class PengambilanUang extends Tabungan {
    public int proteksi;
    public PengambilanUang(int saldo) {
        super(saldo);
    }
    public PengambilanUang(int saldo,int tingkatBunga) {
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
}
