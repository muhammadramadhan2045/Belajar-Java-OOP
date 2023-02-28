package perbankan;
public class Nasabah {
    public String namaAwal;
    public String namaAkhir;
    public Tabungan tabungan;

    public Nasabah(String namaAwal,String namaAkhir){
        this.namaAwal=namaAwal;
        this.namaAkhir=namaAkhir;
    }

    public Tabungan getTabungan() {

        return this.tabungan;
    }

    public String getNamaAkhir() {

        return this.namaAkhir;
    }

    public String getNamaAwal() {

        return this.namaAwal;
    }

    public void setTabungan(Tabungan tabungan) {

        this.tabungan = tabungan;
    }
}