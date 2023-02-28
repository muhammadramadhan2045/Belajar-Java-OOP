public class NumberFormat {
    public static void main(String[] args) {

        try {
            int a = Integer.parseInt("two");
        }catch(java.lang.NumberFormatException e){
            System.out. println("Error : "+e);
        }
    }
}
