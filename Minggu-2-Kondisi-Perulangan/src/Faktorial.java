import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        int i = 0;
        int bil,num;
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan faktoriral\t: !");
        bil = inp.nextInt();
        num=bil;
        int temp1, temp2=1;
        System.out.println("n" + "    " +"n!");
        System.out.println("------------");
        for (i = 1; i <=bil; i++) {
            temp1 = (bil-(num-1));
            System.out.println(i + "    " +temp1*temp2);
            temp2*=temp1;
            num--;


        }
    }
}
