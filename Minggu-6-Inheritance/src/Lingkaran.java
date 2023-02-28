public class Lingkaran {
    private double r;
    public Lingkaran(){
        this.r=7;//nilai default
    }
    public Lingkaran(double r){
        this.r=r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return this.r;
    }
    public double getDiameter(){
        return 2*r;
    }
    public double getKeliling(){
        return 3.14*this.getDiameter();
    }
    public double getLuas(){
        return 3.14*r*r;
    }
}
