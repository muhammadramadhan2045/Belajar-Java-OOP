import java.io.*;
import java.util.ArrayList;

public class data {
    /**
     * Merupakan fungsi yang digunakan untuk membaca data dari dalam file dan mengconvertnya menjadi bentuk array of string dua dimensi
     *
     * @param filePath merupakan lokasi file yang ingin dibaca isinya, setiap kata pada file haruslah dipisahkan dengan spasi (" ")
     * @return merupakan isi file dalam bentuk array of string dua dimensi
     */


    public String[][] setData(String filePath) {
        ArrayList<String[]> resultList = new ArrayList<>(); // List untuk menampung sementara isi file
        String[][] attributes = null; // Array of string yang akan dikembalikan

        try {
            File file = new File(filePath); // Membuat object file dari file yang diinginkan
            BufferedReader br = new BufferedReader(new FileReader(file)); // Membuat object untuk membaca file
            String str = "";

            /*
             * Looping untuk membaca keseluruhan isi file
             */
            while (str != null) {
                str = br.readLine(); // Mengambil setiap baris file

                if (str != null) // Jika baris ada
                    resultList.add(str.split(" ")); // Memisahkan setiap kata menurut spasi (" ")
            }
        } catch (FileNotFoundException e) { // Jika file tidak ditemukan
            System.out.println("File tidak ditemukan");
        } catch (IOException e) { // Jika terjadi kesalahan saat membaca file
            System.out.println("Kesalahan saat membaca file");
        } finally {
            if (resultList.size() > 0) { // Jika file tidak kosong
                int rowSize = resultList.size();
                int columnSize = resultList.get(0).length;

                attributes = new String[rowSize][columnSize]; // Membuat array of string berukuran data
                attributes = resultList.toArray(attributes); // Menyimpan data dari list ke array of string
            }
        }

        return attributes; // Mengembalikan data
    }
}
