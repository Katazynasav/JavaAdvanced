package IO.io.Example2;

import java.io.*;

public class StudentWriter {
    public static String filePath = "src/main/java/IO/io/Example2/studentList.txt";

    public static void main(String[] args) throws IOException {
        Student student = new Student("Harry", "Potter", 16);
        File file = new File(filePath);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
    }
}

