public class ClassCast {
    public static void main(String[] args) {
        try{
            Object i = Integer.valueOf(42);
            String s = (String)i;
        }catch (ClassCastException c){
            System.out.println("Error : "+c.getMessage());
        }
    }
}
