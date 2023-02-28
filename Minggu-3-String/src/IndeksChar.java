import java.util.Scanner;

public class IndeksChar {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int count=0;
        int[] temp=new int[1000];
        int j=0;
        int found=0;
        String kal,kar;
        System.out.print("Kalimat : ");
        kal=inp.nextLine();
        System.out.print("Karakter : ");
        kar=inp.next();
        //System.out.println(kar);
        for(int i=0;i<kal.length();i++){
            if(kar.charAt(0)==kal.charAt(i)){
                count ++;
                temp[j]=i;
                j++;
                found=1;
            }
        }
        if(found==1){
            System.out.print("Karater "+kar+" terdapat pada indeks ");
            for(int i=0;i<j;i++)
                System.out.print(temp[i]+",");
        }else{
            System.out.println("Sorry");
        }


    }
}
