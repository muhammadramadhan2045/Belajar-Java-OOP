import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        File file =new File("Data.txt");
        BufferedReader fileReader;

            try {
                fileReader=new BufferedReader(new FileReader(file));
                while (true){
                    String line = fileReader.readLine();
                    if (line==null)
                        break;
                    System.out.println(line);
                }
            }catch (IOException e){
                 System.out.println("Error : "+e);
            }


    }

}
