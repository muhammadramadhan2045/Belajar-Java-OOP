public class Katak {
    public int umur;
    public String nama;
    public Katak(String nama){
        this.nama=nama;
        this.umur=0;
    }
    public Katak(String nama,int umur){
        this.nama=nama;
        this.umur=umur;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String caraBergerak(){
            return "melompat";
    }
}
