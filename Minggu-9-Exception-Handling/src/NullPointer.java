import java.util.Date;

public class NullPointer {
    public static void main(String[] args) {
        Date d = null;
        try{
            System.out.println(d.toString());
        }catch (NullPointerException n){
            System.out.println("Error : "+n.getMessage());
        }

    }
}
