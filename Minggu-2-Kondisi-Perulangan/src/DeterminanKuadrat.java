import java.util.Scanner;
public class DeterminanKuadrat {
    public static void main(String[] args) {
        int a,b,c;
        double x1,x2,D;
        Scanner inp=new Scanner(System.in);
        //persamaan kuadrat : ax2 + bx + c = 0
        //D = b2- 4ac
        System.out.print("Masukan a\t:");
        a= inp.nextInt();
        System.out.print("Masukan b\t:");
        b= inp.nextInt();
        System.out.print("Masukan c\t:");
        c= inp.nextInt();
        D=(b*b)-(4*a*c);
        if(D==0){
            x1=-b/(2*a);
            x2=x1;
            System.out.println("Kedua akar real yang kembar");
            System.out.println("Nilai x1\t:"+x1);
            System.out.println("Nilai x2\t:"+x2);
        }else if(D>0){
            x1=(-b+Math.sqrt(D))/(2*a);
            x2=(-b-Math.sqrt(D))/(2*a);
            System.out.println("Kedua akar real yang berlainan");
            System.out.println("Nilai x1\t:"+x1);
            System.out.println("Nilai x2\t:"+x2);
        }else if(D<0){
            x1=(-b/(2*a))+(Math.sqrt(D)/(2*a))*Math.sqrt(-1.00);
            x2=(-b/(2*a))-(Math.sqrt(D)/(2*a))*Math.sqrt(-1.00);
            System.out.println("Kedua akar nya Imajiner");
            System.out.println("Nilai x1\t:"+ x1);
            System.out.println("Nilai x2\t:"+ x2);
        }
        else
            System.out.print("Nothing");

    }
}
