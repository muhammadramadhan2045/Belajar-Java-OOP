public class ArrayStore {
    public static void main(String[] args) {
        try {
            Object a[] = new Double[2];
            a[0] = 4;
        }

        catch (ArrayStoreException e) {
            System.out.println("ArrayStoreException found: " + e);
        }
    }
}
