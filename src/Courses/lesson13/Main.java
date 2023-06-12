package Courses.lesson13;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //File file = new File("\\Users\\Maxim\\Desktop\\Testing\\newFile.txt");
        //boolean result = file.createNewFile();
        //Создай файл

        //System.out.println(result);

        //File allFiles[] = file.listFiles();
        //Все файлы в массив

        //System.out.println(Arrays.toString(allFiles));

        /*if (file.isFile()){
            System.out.println("File is here");
        } else {
            System.out.println("No any file here");
        }*/

        /*FileOutputStream outputStream = new FileOutputStream(file);
        String text = "Hello from Poland - Польска ест щила!";
        outputStream.write(text.getBytes());
        outputStream.flush();*/
        //Позволяет сохранить всю информацию до него
        //Отработает так и так, можешь указать сколько проигнорировать и с какого начинать ()
        //Мы открываем поток и потом обязательно надо его закрыть
        /*outputStream.close();*/

        /*int i;
        FileInputStream inputStream = new FileInputStream(file);
        while ((i = inputStream.read()) != -1) {
            System.out.print((char) i);
        }
        inputStream.close();

        System.out.println("");


        FileReader reader = new FileReader(file);
        int j;
        while ((j = reader.read()) != -1) {
            System.out.print((char) j);
        }

        try (FileWriter writer = new FileWriter(file, true)) {
            //Если флаг true то он дописывает информацию
            writer.write("Hello");
            writer.flush();
        } catch (IOException exception) {
            exception.printStackTrace();
        }*/

        File tms = new File("/Users/Maksim/Desktop/tms.txt");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        FileWriter fileWriter = new FileWriter(tms);
        fileWriter.write(text);
        fileWriter.close();

        FileReader fileReader = new FileReader(tms);
        int i;
        StringBuilder stringBuilder = new StringBuilder();
        while ((i = fileReader.read()) != -1){
            stringBuilder.append((char) i);
        }
        fileReader.close();

        System.out.println(stringBuilder.toString().replace(" ", "_"));

        //Сериализация
        Weekend weekend = new Weekend();
        weekend.name = "Friday";

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(tms));
        outputStream.writeObject(weekend);
        outputStream.close();

    }
}
