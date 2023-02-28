package Tugas1;

public class Superman1 extends HomoSapien implements Flyer1{

    @Override
    void skill() {
        System.out.println("Supeman memiliki kekuatan untuk bisa terbang & tubuh yang berotot");
    }

    @Override
    void eat() {
        System.out.println("Superman juga makan nasi");
    }

    @Override
    public void takeoff() {
        System.out.println("Superman take off");
    }

    @Override
    public void land() {
        System.out.println("\nSUperman baru selesai terbang dan mendarat ke bumi");
    }

    @Override
    public void fly() {
        System.out.println("\nSuperman terbang dengan kekuatannya");
    }

    public void leapBuilding(){
        System.out.println("\nSuperman menghancurkan bangunan");
    }
    public void stopBullet() {
        System.out.println("\nSuperman menangkap peluru dengan kekuatannya");
    }
}
