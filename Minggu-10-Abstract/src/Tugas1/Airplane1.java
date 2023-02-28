package Tugas1;

public class Airplane1 extends Vehincle implements Flyer1{
    @Override
    void FuelNeeds() {
        System.out.println("Pesawat besar menghabiskan sekitar empat liter per detik, atau 240 liter per menit, dan 14.400 liter per jam");
    }

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
