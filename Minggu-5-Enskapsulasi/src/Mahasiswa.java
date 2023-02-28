public class Mahasiswa {
    private int nrp;
    private String nama;

    Mahasiswa(int i , String n) {
        this.nrp=i;
        this.nama=n;
    }

    public String getNama() {

        return this.nama;
    }

    public int getNrp() {

        return this.nrp;
    }

    public void setNrp(int nrp){
        this.nrp=nrp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}


/*    public String getNama() {

        return this.nama;
    }

    public int getNrp() {

        return this.nrp;
    }

    public void setNrp(int nrp){
        this.nrp=nrp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }*/