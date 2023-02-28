public class Fish extends Animal implements Pet{
    String name;
    Fish(){
        System.out.println("ini Fish\n");
    }
    public String getName(){
        return this.name;
    }
    public String setName(String name){
        return this.name=name;
    }

    @Override
    public void play() {
        System.out.println("Fish sedang bermain ");
    }

    @Override
    public void walk() {
        System.out.println("Ikan tidak dapat berjalan namun dapat berenang");
    }

    @Override
    public void eat() {
        System.out.println("Fish sedang memakan pur ikan");
    }

}
