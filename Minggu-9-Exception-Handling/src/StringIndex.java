public class StringIndex {
    public static void main(String[] args) {
        String str="Ini ramadhan";
        System.out.println("Panjang dari String : "+str.length());
        try{
            System.out.println(str.charAt(13));
        }catch (StringIndexOutOfBoundsException s){
            System.out.println("Error yang terjadi : "+s);
        }

    }
}
