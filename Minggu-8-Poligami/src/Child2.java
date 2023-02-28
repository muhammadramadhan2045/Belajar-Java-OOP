public class Child2 extends Parent2 {
    public void method1(){
        System.out.println("Child's a method1()");
    }

    public static void main(String[] args) {
        Parent2 p=new Child2();
        p.method2();
    }
}
