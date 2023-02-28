public class Airplane implements Flyer{

    @Override
    public void takeoff() {
        System.out.println("Pesawat berhasil take off");
    }
    @Override
    public void land() {
        System.out.println("\nPesawat mendarat dengan aman");
    }

    @Override
    public void fly() {
        System.out.println("\nKeep those engines running");
    }

}
