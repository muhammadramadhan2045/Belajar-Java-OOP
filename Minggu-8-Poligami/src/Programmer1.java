public class Programmer1 extends Pegawai1{
    public int bonus;
    Programmer1(String nama, int gaji,int bonus){
        super(nama,gaji);
        this.bonus=bonus;
    }

    @Override
    public int infoGaji() {
        return super.infoGaji();
    }

    public int infoBonus() {
        return this.bonus;
    }
}
