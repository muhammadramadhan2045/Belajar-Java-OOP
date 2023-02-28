public class Kerucut extends Lingkaran {
    private double tinggi;

    public Kerucut(){
        this.tinggi=10;//nilai default
    }
    public Kerucut(double r,double t){
        super(r);
        this.tinggi=t;
    }
    public void setTinggi(double tinggi){
        this.tinggi=tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }
    public double getVolume(){
        return (super.getLuas()*this.tinggi)/3;
    }
}
