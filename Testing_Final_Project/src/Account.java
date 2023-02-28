public class Account {
    private String namaAwal;
    private String namaAkhir;
    private int no_Akun;
    private Tabungan tabungan;
    private Uang thisMoney;

    public Account(int no_Akun,String namaAwal,String namaAkhir){
        this.no_Akun=no_Akun;
        this.namaAwal=namaAwal;
        this.namaAkhir=namaAkhir;
    }
    public String getNamaAkhir() {

        return this.namaAkhir;
    }

    public int getNo_Akun() {
        return no_Akun;
    }

    public String getNamaAwal() {

        return this.namaAwal;
    }

   /*public Tabungan getTabungan() {

        return this.tabungan;
    }
    public void setTabungan(Tabungan tabungan) {

        this.tabungan = tabungan;
    }*/

    public Uang getThisMoney() {
        return this.thisMoney;
    }
    public void setThisMoney(Uang thisMoney) {
        this.thisMoney = thisMoney;
    }
}