public class Mahasiswa {
    public int nrp;
    public String nama;

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
}
