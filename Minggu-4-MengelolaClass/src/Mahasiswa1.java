
public class Mahasiswa1 {
    public int nrp;
    private String nama;

    public Mahasiswa1(){
        this(0,"");

    }
    public Mahasiswa1(String nama){

        this(0,nama);
    }
    public Mahasiswa1(int nrp,String nama){
        this.nrp=nrp;
        this.nama=nama;
    }
}
