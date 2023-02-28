import java.util.Scanner;

public class SwitchName {
    public static void main(String[] args) {
        String name1,name2,name3,name4;
        Scanner inp=new Scanner(System.in);
        System.out.print("String 1\t:");
        name1= inp.nextLine();
        System.out.print("String 2\t:");
        name2= inp.nextLine();
        name3=name1.substring(0,name1.indexOf(' '))+name2.substring(name2.indexOf(' '));
        name4=name2.substring(0,name2.indexOf(' '))+name1.substring(name1.indexOf(' '));
        System.out.println("\nString 1\t:"+name3);
        System.out.println("String 2\t:"+name4);

    }
}
