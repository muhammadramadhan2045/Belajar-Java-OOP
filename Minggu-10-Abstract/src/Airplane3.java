public class Airplane3 implements Flyer{

    @Override
    public void takeoff() {
        System.out.println("Airplane melakukan take off");
    }

    @Override
    public void land() {
        System.out.println("Airplane melakukan pendaratan");
    }

    @Override
    public void fly() {
        System.out.println("\nAirplane terbang menggunakan sayap dan dorongan mesin jet");
    }

}
