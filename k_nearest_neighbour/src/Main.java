import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static ArrayList<Point> trainingPoints = new ArrayList<>();
    private static ArrayList<Point> testingPoints = new ArrayList<>();

    private static int k;
    private static Scanner scanner = new Scanner(System.in);

    /**
     * TRAINING_DATA_FILES merupakan lokasi data training
     */
    private static final String TRAINING_DATA_FILES = "E:\\belajar-java\\Learn Java\\k_nearest_neighbour\\src\\DataTraining.txt";

    /**
     * TESTING_DATA_FILES merupakan lokasi data testing
     */
    private static final String TESTING_DATA_FILES = "E:\\belajar-java\\Learn Java\\k_nearest_neighbour\\src\\DataTesting.txt";

    public static void main(String[] args) {
        trainingPoints = setData(TRAINING_DATA_FILES);
        testingPoints = setData(TESTING_DATA_FILES);

        System.out.print("Masukkan k : ");
        k = scanner.nextInt();

        System.out.println("");

        searchHypotesis();
    }

    /**
     * Merupakan fungsi yang digunakan untuk membaca data dari dalam file dan
     * mengconvertnya menjadi bentuk array of string dua dimensi
     *
     * @param filePath merupakan lokasi file yang ingin dibaca isinya, setiap kata
     *                 pada file haruslah dipisahkan dengan spasi (" ")
     * @return merupakan isi file dalam bentuk array of string dua dimensi
     */
    private static ArrayList<Point> setData(String filePath) {
        ArrayList<String[]> resultList = new ArrayList<>(); // List untuk menampung sementara isi file
        ArrayList<Point> dataPoints = new ArrayList<>();

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
                for (String[] strings : resultList) {
                    Point point;

                    double sepalLength = Double.parseDouble(strings[0]);
                    double sepalWidth = Double.parseDouble(strings[1]);
                    double petalLength = Double.parseDouble(strings[2]);
                    double petalWidth = Double.parseDouble(strings[3]);

                    try {
                        int answer = Integer.parseInt(strings[4]);

                        point = new Point(sepalLength, sepalWidth, petalLength, petalWidth, answer);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        point = new Point(sepalLength, sepalWidth, petalLength, petalWidth);
                    }

                    dataPoints.add(point);
                }
            }
        }

        return dataPoints; // Mengembalikan data
    }

    private static void searchHypotesis() {
        ArrayList<Double> distanceList = new ArrayList<>();
        ArrayList<Point> nearestPoints = new ArrayList<>();

        int setosaCount, versicolorCount, virginicaCount;

        //testing dimasukkan dalam array
        for (Point testingPoint : testingPoints) {
            double[] testingVector = { testingPoint.getSepalLength(), testingPoint.getSepalWidth(),
                    testingPoint.getPetalLength(), testingPoint.getPetalWidth() };

            //
            distanceList.clear();
            nearestPoints.clear();

            setosaCount = 0;
            versicolorCount = 0;
            virginicaCount = 0;

            //rumus knn
            for (Point trainingPoint : trainingPoints) {
                double[] trainingVector = {
                        trainingPoint.getSepalLength(), trainingPoint.getSepalWidth(),
                        trainingPoint.getPetalLength(), trainingPoint.getPetalWidth(),
                };
                double[] t = { trainingVector[0] - testingVector[0], trainingVector[1] - testingVector[1],
                        trainingVector[2] - testingVector[2], trainingVector[3] - testingVector[3] };

//
                double distance = Math.sqrt(Math.pow(t[0], 2) + Math.pow(t[1], 2) + Math.pow(t[2], 2) + Math.pow(t[3], 2));

                trainingPoint.setDistance(distance);
                distanceList.add(distance);
            }

            Collections.sort(distanceList);

            System.out.println("");

            for (int i = 0; i < k; i++) {
                Point point = new Point();
                double distance = distanceList.get(i);


                //buat untuk get answer pointnya
                for (Point trainingPoint : trainingPoints) {
                    if (trainingPoint.searchDistance(distance)) {
                        point = trainingPoint;
                        break;
                    }
                }

                System.out.println(point.getAnswer() + ", " + distance);

                nearestPoints.add(point);
            }

            System.out.println("");

            //untuk menghitung jumlah nilai answer
            for (Point nearestPoint : nearestPoints) {
                switch (nearestPoint.getAnswer()) {
                    case 0:
                        setosaCount++;
                        break;
                    case 1:
                        versicolorCount++;
                        break;
                    case 2:
                        virginicaCount++;
                        break;

                }
            }

            System.out.print("Sepallength : " + testingPoint.getSepalLength() + ", Sepalwidth : "
                    + testingPoint.getSepalWidth() + ", Petallength : " + testingPoint.getPetalLength()
                    + ", Petalwidth : " + testingPoint.getPetalWidth() + " => ");

            if (setosaCount > versicolorCount && setosaCount > virginicaCount) {
                System.out.println("Setosa");
            } else if (versicolorCount > setosaCount && versicolorCount > virginicaCount) {
                System.out.println("Versicolor");
            } else if (virginicaCount > setosaCount && virginicaCount > versicolorCount) {
                System.out.println("Virginica");
            } else {
                System.out.println("Tidak diketahui");
            }
        }
    }
}
