package IO.io.Example1;

import java.io.*;

public class MyFileReader {
    public static String filePath = "src/main/java/IO/io/Example1/data.txt";

        public static void main(String[] args) throws IOException {
            File failas = new File(filePath);
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(failas));
                String eilute;
                System.out.println("Spausdiname failo turini apacioje:");
                while ((eilute = br.readLine()) != null) {
                    System.out.println(eilute);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                br.close();
            }
        }
    }

