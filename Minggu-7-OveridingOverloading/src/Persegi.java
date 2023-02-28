public class Persegi extends BangunDatar{
    private int sisi;

    public  Persegi(int sisi){
        this.sisi=sisi;
    }
    @Override
    public double keliling() {
        return 4*sisi;
    }

    @Override
    public double luas() {
        return sisi*sisi;
    }
}
