import java.util.Scanner;
public class DecToBin {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int x;
        System.out.print("Masukan Decimal\t: ");
        x= inp.nextInt();
        String binNumber = Integer.toBinaryString(x);
        System.out.print("Biner\t: "+binNumber);

    }
}

/*        Scanner inp = new Scanner(System.in);
        int x,r;
        int biner[]=new int[20];
        int i=0,j=0;
        System.out.print("Masukan Decimal :");
        x= inp.nextInt();
        while(x!=0){
            j=i;
            r=x%2;
            biner[i]=r;
            x=x/2;
            i++;
        }

        for(i=j;i>=0;i--)
        System.out.print(+biner[i]);*/