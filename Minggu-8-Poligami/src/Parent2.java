public class Parent2 {
    private void method1(){
        System.out.println("Parent's a method1()");
    }

    public void method2(){
        System.out.println("Parent's a method2()");
        method1();
    }
}
