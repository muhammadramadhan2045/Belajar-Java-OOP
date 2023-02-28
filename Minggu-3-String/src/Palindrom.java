import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println("Mencari kalimat palindrom");
        Scanner inp=new Scanner(System.in);
        String kal;
        int pas=0;
        System.out.print("Masukan kalimat\t:");
        kal=inp.nextLine();
        int j=kal.length()-1;
        for(int i=0;i<kal.length();i++){
            if(kal.charAt(i)==kal.charAt(j)){
                pas++;
                j--;

            }

        }
        if(pas==kal.length()){
            System.out.println("Ya palindrom");
        }else{
            System.out.println("tidak palindrom");
        }
    }
}
