package Tugas2;

public class SeaPlane extends Airplane2 implements Sailer{

    @Override
    public void dock() {
        System.out.println("Sea Plane sedang berada di dermaga");
    }

    @Override
    public void cruise() {
        System.out.println("Sea plane sedang terbang rendah diatas sungai Mahakam");
    }
}
