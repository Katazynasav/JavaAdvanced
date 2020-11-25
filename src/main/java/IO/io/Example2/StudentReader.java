package IO.io.Example2;

import java.io.*;

public class StudentReader {
    public static String filePath = "src/main/java/IO/io/Example2/studentList.txt";
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File(filePath);

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student student = (Student) objectInputStream.readObject();

        System.out.println(student.getFirstName() + " " + student.getLastName() + ", Age:  " + student.getAge());

    }
}
