public class Derived extends Base{
    int i = -1;

    public static void main(String[] args) {
        Base b=new Derived();
        System.out.println(b.i);
        //b.amethod();
    }

    @Override
    public void amethod() {
        System.out.println("Derived.amethod()");
    }
}
