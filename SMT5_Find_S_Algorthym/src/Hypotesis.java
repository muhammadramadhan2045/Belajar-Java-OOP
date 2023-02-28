
/**
 * Fungsi untuk penentuan hipotesa berdasarkan target yang diinginkan
 *
 * @param target adalah target yang diinginkan
 */
public class Hypotesis {


    private String[][] testingAttributes;
    private static String[] hypotesis;
    private String[][] trainingAttributes;


    public Hypotesis(String[][] testingAttributes,String[][] trainingAttributes,String[] hypotesis){
        this.trainingAttributes=trainingAttributes;
        this.testingAttributes=testingAttributes;
        this.hypotesis=hypotesis;
    }

    public void getHypotesis(String target) {
        int attributesLength = trainingAttributes.length;

        System.out.println("Search hypotesis with target \"" + target + "\"...");
        System.out.println("");

        if (attributesLength > 0) { // Pengecekan apakah attribute ada isinya
            int instanceLength = trainingAttributes[0].length;

            if (instanceLength > 1) { // Pengecekan apakah attribute minimal memiliki 2 instance
                instanceLength--; // Jumlah instance dikurangi satu agar tidak membaca target

                hypotesis = new String[instanceLength]; // Membuat array hipotesis sebesar jumlah instance
                int attributeFirstIndex = 0;

                /*
                 * Pengambilan dataset pertama yang memiliki target yang diinginkan
                 */
                for (int i = 0; i < attributesLength; i++) {
                    if (trainingAttributes[i][instanceLength].equals(target)) {
                        attributeFirstIndex = i;
                        break;
                    }
                }

                /*
                 * Menyimpan dataset pertama di array hipotesis
                 */
                System.arraycopy(trainingAttributes[attributeFirstIndex], 0, hypotesis, 0, instanceLength);

                /*
                 * Proses membuat instance yang berbeda disetiap dataset mejadi '?'
                 */
                for (int i = 1; i < attributesLength; i++) {
                    if (trainingAttributes[i][instanceLength].equals(target)) {
                        for (int j = 0; j < instanceLength; j++) {
                            if (!hypotesis[j].equals(trainingAttributes[i][j]))
                                hypotesis[j] = "?";
                        }
                    }
                }

                /*
                 * Menampilkan hipotesis yang telah didapatkan
                 */
                for (String h : hypotesis)
                    System.out.println(h);

                System.out.println("");
            } else
                System.out.println("Instance must over than 1, and the last column mus be target...");
        } else
            System.out.println("Attribute is empty...");
    }
    public void testHypotesis() {
        boolean isSame; // Untuk mengecek apakah hipotesa sama dengan data testing

        /*
         * Mengecek keseluruhan data testing
         */
        for (String[] testingArray : testingAttributes) {
            System.out.print("Testing data : ");

            isSame = true; // Mengasumsikan hipotesa mirip dengan data testing

            /*
             * Mengecek setiap attribute pada data testing
             */
            for (int i = 0; i < testingArray.length; i++) {
                String attribute = testingArray[i]; // Mengambil attribute

                /*
                 * Mengecek apakah data hipotesa mirip dengan data testing
                 */
                if (!hypotesis[i].equals("?") && !attribute.equals(hypotesis[i]))
                    isSame = false;

                attribute += (i == (testingArray.length - 1) ? " " : ", ");
                System.out.print(attribute);
            }

            /*
             * Mengecek kesimpulan dan menampilkan
             */
            if (isSame)
                System.out.println("= Ya");
            else
                System.out.println("= Tidak");
        }
    }
}
