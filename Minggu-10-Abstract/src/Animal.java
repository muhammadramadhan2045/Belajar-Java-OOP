public abstract class  Animal {
    int legs;

    protected Animal(int legs) {
        this.legs=legs;
    }

    protected Animal() {
    }

    public void walk(){
        System.out.println("Hewan ini berjalan dengan "+legs+" kaki.");
    }
    abstract void eat();

}