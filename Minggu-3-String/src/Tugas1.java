import java.util.Locale;
import java.util.Scanner;

public class Tugas1 {
        //sebuah program yang mengubah huruf pertama suatu string
        //dengan huruf terakhir string tersebut dan sebaliknya!
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            int i=0;
            String s2,s3;
            System.out.print("Masukkan kalimat: ");
            String kal=inp.nextLine(), s1=kal.substring(0,1);
            kal=kal.replace(Character.toString(kal.charAt(0)),
                    Character.toString(kal.charAt(kal.length()-1)));
            kal=kal.substring(0, kal.length()-1)+s1;
            System.out.println(kal.toLowerCase(Locale.ROOT));
        }
}
