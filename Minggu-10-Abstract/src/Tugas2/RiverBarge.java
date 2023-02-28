package Tugas2;

public class RiverBarge extends Vehincle2 implements Sailer{
    @Override
    public void dock() {
        System.out.println("River Barge sedang berada di dermaga ");
    }

    @Override
    public void cruise() {
        System.out.println("River Barge sedang berlayar di sungai Mahakam");
    }

    @Override
    void FuelNeeds() {
        System.out.println("River Barge mesin berbahan bakar diesel dengan kebutuhan 50 Liter ");
    }
}
