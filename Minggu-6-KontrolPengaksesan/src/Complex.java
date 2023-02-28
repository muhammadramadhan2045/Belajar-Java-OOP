public class Complex {
    private double real,imaginary;

    public Complex(double r, double i){
        real=r;
        imaginary=i;
    }
    public Complex add(Complex c){
        return new Complex(real+c.real,imaginary+c.imaginary);
    }

    @Override
    public String toString() {
        return "real=" + real + ", imaginary=" + imaginary;
    }
}
