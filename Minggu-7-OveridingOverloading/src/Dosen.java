public class Dosen extends Orang {
    public int nip;

    public Dosen(String nama){
        super(nama);

    }
    public Dosen(String nama,int nip){
        super(nama);
        this.nip=nip;
    }

    public Dosen(String nama,int nip,int umur){
        super(nama,umur);
        this.nip=nip;
    }

    public void info(){
        System.out.println("Nama Dosen\t:"+nama);
        System.out.println("NIP Dosen\t:"+this.nip);
        System.out.println("Umur Dosen\t:"+umur);
    }
}
