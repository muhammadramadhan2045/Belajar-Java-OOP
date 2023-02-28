public class P5ThrowDemo {
    public static void main(String[] args) {
        String input = "invalid input";
        try {
            if (input.equals("invalid input")) {
                throw new RuntimeException("throw demo");
            }else{
                System.out.println(input);
            }
        }catch (RuntimeException e){
            System.out.println("Exception caught:"+e);
        }
    }
}