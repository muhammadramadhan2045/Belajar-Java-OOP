public class Truk {
    public double muatan;
    public double muatanMax;

    Truk(double muatanMax){
        this.muatanMax=muatanMax;
    }
    public double getMuatanMax() {
        return this.muatanMax;
    }

    public double getMuatan() {
        return this.muatan;
    }
    public void tambahMuatan(double berat){
        if(muatan+berat<muatanMax) {
            this.muatan+=berat;
        }
    }
}
