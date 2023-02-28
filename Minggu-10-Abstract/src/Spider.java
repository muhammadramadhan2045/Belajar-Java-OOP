public class Spider extends Animal{


    Spider() {
        super.legs=8;
        System.out.println("Ini Spider\n");
    }

    @Override
    void eat() {
        System.out.println("Spider sedang memangsa lalat");
    }
}
