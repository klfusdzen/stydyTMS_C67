package Homework.homework13;

import java.util.Arrays;
import java.util.Comparator;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        File file = new File("/Users/Maksim/Desktop/romeo-and-juliet.txt");
        try (FileReader fr = new FileReader(file)){
            int i;
            StringBuilder newLine = new StringBuilder();
            while ((i = fr.read()) != -1) {
                newLine.append((char) i );
            }

            String[] result = newLine.toString().split("[^A-z]");
            Arrays.sort(result, Comparator.comparing(String::length));

            File fileResult = new File("/Users/Maksim/Desktop/result.txt");
            try (FileWriter fw = new FileWriter(fileResult)){
                fw.write(result[result.length - 1]);
                System.out.println("Longest word is written");
            }catch (IOException exception){
                exception.printStackTrace();
            }
        }catch (RuntimeException | IOException exception){
            System.out.println("Exception is found " + exception);
        }
    }
}