package Homework.homework11.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = "1111-3743-55 1111-3743-66 1423-1512-51 " +
                "teachmeskills@gmail.com maxim550@yandex.ru " +
                "klfusdzen@gmail.com +(25)9421790 +(25)9431865";

        Pattern patternDocumentNumber = Pattern.compile("\\d{4}-\\d{4}-\\d{2}");
        Pattern patternEmail = Pattern.compile("[a-zA-Z0-9]+@[a-zA-Z0-9.]+");
        Pattern patternPhoneNumber = Pattern.compile("[+][(]\\d{2}[)]\\d{7}");

        Matcher matcherDocumentNumber = patternDocumentNumber.matcher(input);
        Matcher matcherEmail = patternEmail.matcher(input);
        Matcher matcherPhoneNumber = patternPhoneNumber.matcher(input);

        while (matcherDocumentNumber.find()) {
            System.out.println("Document number: " + matcherDocumentNumber.group());
        }
        while (matcherEmail.find()) {
            System.out.println("Email: " + matcherEmail.group());
        }
        while (matcherPhoneNumber.find()) {
            System.out.println("Phone number: " + matcherPhoneNumber.group());
        }
    }
}
