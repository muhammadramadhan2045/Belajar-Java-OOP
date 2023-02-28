public class ArrayNegative {
    public static void main(String[] args) {
        try{
            int a[]=new int[-1];
        }catch (NegativeArraySizeException e){
            System.out.println("Error yang terjadi :" +e);
        }
    }
}


