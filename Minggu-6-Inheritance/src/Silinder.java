public class Silinder extends Lingkaran {
    private double tinggi;

    public Silinder(){
        this.tinggi=10;//nilai default
    }
    public Silinder(double r,double t){
        super(r);
        this.tinggi=t;
    }
    public void setTinggi(double tinggi){
        this.tinggi=tinggi;
    }

    public double getTinggi() {
        return this.tinggi;
    }
    public double getVolume(){
        return super.getLuas()*this.tinggi;
    }
}
