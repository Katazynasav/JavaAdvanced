package IO.io.Example1;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class MyFileWriter {
    public static String filePath = "src/main/java/IO/io/Example1/data.txt";

    public static void main(String[] args) throws IOException {
        File failas = new File(filePath);

        List<String> names = Arrays.asList("Kara","Micheal","Kuba");

        System.out.println("Writing to file..");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(failas));

        for (String name : names){
            try {
                bufferedWriter.write(name + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }}
            bufferedWriter.close();


    }
}
