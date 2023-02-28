public class Truk {
    private double muatan;
    private double muatanMax;

    Truk(double muatanMax){
        this.muatanMax=muatanMax;
    }
    public double getMuatanMax() {
        return this.muatanMax;
    }
    public double getMuatan() {
        return this.kiloToNewt(muatan);
    }
    public boolean tambahMuatan(double berat){
        if(muatan+berat<muatanMax) {
            this.muatan+=berat;
            return true;
        }else
            return false;
    }
    public double kiloToNewt(double berat){
        return berat=berat*9.8;
    }
    public double newtsToKilo(double berat){
        return berat/=9.8;
    }
}
