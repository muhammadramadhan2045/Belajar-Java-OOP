public class Superman implements Flyer{

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
