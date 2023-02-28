public class Client {
    void useThem(){
        Complex c1=new Complex(1,2);
        Complex c2=new Complex(3,4);
        Complex c3=c1.add(c2);
        //double d =c3.real;//illegal
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }

}
