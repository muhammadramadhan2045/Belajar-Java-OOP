public class Lingkaran extends BangunDatar{
    private float r;
    public Lingkaran(float r){
        this.r=r;
    }

    @Override
    public double luas() {
        return 3.14*r*r;
    }

    @Override
    public double keliling() {
        return 2*3.14*this.r;
    }
}
