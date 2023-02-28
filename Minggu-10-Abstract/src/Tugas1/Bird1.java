package Tugas1;

public class Bird1 extends Animal1 implements Flyer1{
    @Override
    void eat() {
        System.out.println("Bird sedang makan");
    }

    @Override
    public void takeoff() {
        System.out.println("Bird take off");
    }

    @Override
    public void land() {
        System.out.println("\nBird landing");
    }

    @Override
    public void fly() {
        System.out.println("\nBird terbang dengan mengepakkan sayapnya");
    }

    public void buildNest() {
        System.out.println("\nBird membuat sarang");
    }
    public void layEggs() {
        System.out.println("\nBird sedang mengerami telur");
    }
}
