package Nio.Example1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.StandardOpenOption.APPEND;

public class Example1 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/main/java/Nio/Example1/things.txt");

        List<String> fileLines = Files.readAllLines(path);
        for(String eilute : fileLines) {
            System.out.println(eilute);
        }

        List<String> linesToWrite = Arrays.asList("lova","pagalve");
        Files.write(path,linesToWrite,APPEND);
    }
}
