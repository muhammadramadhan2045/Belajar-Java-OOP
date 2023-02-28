public class finds {

    /**
     * trainingAttributes merupakan data training untuk mencari hipotesa data
     * testingAttributes merupakan data testing untuk mencari kesimpulan berdasarkan hipotesa yang ditemukan
     * hypotesis merupakan hipotesa data berdasarkan training data yang digunakan

     */

    private static String[][] trainingAttributes, testingAttributes;
    private static String[] hypotesis;
    private static final String TRAINING_DATA_FILES = "E:\\Learn Java\\SMT5_Find_S_Algorthym\\src\\dataTraining.txt";
    private static final String TESTING_DATA_FILES = "E:\\Learn Java\\SMT5_Find_S_Algorthym\\src\\dataTesting.txt";


    /**
     * Merupakakan method main yang dijalankan saat program di jalankan
     * Method ini akan mengambil data training dan data testing dari lokasi data
     * Lalu mencari hipotesa berdasarkan data training dan mencari kesimpulan berdasarkan hipotesa dan data testing
     *
     * @param args merupakan parameter dari user saat program dijalankan
     */
    public static void main(String[] args) {

        data dt=new data();
        trainingAttributes = dt.setData(TRAINING_DATA_FILES);
        testingAttributes = dt.setData(TESTING_DATA_FILES);
        Hypotesis hyp=new Hypotesis(testingAttributes,trainingAttributes,hypotesis);
        hyp.getHypotesis("Ya");
        hyp.testHypotesis();
    }
}
