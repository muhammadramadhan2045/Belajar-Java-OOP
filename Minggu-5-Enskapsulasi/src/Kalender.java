public class Kalender {
    private int tanggal;
    private int bulan;
    private int tahun;

    public Kalender(int tanggal){
        this.tanggal=tanggal;
        bulan=1;
        tahun=2000;
    }

    public Kalender(int bulan,int tahun){
        tanggal=1;
        this.tahun=tahun;
        this.bulan=bulan;
    }
    public Kalender(int tanggal,int bulan,int tahun){
        this.tahun=tahun;
        this.bulan=bulan;
        this.tanggal=tanggal;
    }

    public int getBulan() {
        return this.bulan;
    }

    public int getTanggal() {
        return this.tanggal;
    }

    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }

    public int getTahun() {
        return this.tahun;
    }
}
