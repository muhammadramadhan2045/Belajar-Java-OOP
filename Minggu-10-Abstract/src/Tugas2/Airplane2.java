package Tugas2;

public class Airplane2  extends Vehincle2 implements Flyer2{

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

    @Override
    void FuelNeeds() {
        System.out.println("Pesawat besar menghabiskan sekitar empat liter per detik, atau 240 liter per menit, dan 14.400 liter per jam");
    }
}
