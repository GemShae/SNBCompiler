package output;

import java.io.BufferedReader;
import java.io.FileReader;

public class OutputResult {


    public static void main(String[] args) {
        //System.out.println("Shanya");
        //System.out.println(result);
        String filePath = "output.txt";
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        }catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
