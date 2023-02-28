public class Manajer1 extends Pegawai1{
    int tunjangan;
    Manajer1(String nama,int gaji,int tunjangan){
        super(nama, gaji);
        this.tunjangan=tunjangan;
    }

    @Override
    public int infoGaji() {
        return super.infoGaji();
    }

    public int infoTunjangan() {
        return this.tunjangan;
    }
}
