public class Percobaan3 {
    public static void main(String[] args) {
        int bil=10;
        String b[]={"a","b","c"};
        try{
            System.out.println(bil/0);
            System.out.println(b[3]);
        }catch (ArithmeticException e){
            System.out.println("Error artimetik");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error kapasitas array yang melebihi batas");
        }catch (Exception e){
            System.out.println("Terdapat error");
        }
    }
}
