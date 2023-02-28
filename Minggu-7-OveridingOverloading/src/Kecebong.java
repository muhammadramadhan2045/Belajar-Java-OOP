public class Kecebong extends Katak{
    public double panjangEkor;
    Kecebong(int umur,String nama,double panjangEkor){
        super(nama, umur);
        this.panjangEkor=panjangEkor;
    }

    @Override
    public String caraBergerak() {
        return "berenang";
    }
}
