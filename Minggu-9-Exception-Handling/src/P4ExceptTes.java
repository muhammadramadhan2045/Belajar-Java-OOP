public class P4ExceptTes {
    public static void main(String[] args) {
        int a[]=new int[2];
        try{
            System.out.println("Acces element three :"+a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown :"+e);
        }finally {
            a[0]=6;
            System.out.println("First Element value :"+a[0]);
            System.out.println("The finally statement is executed");
        }
    }
}
