package Homework.homework15.task2;

import java.util.HashMap;
import java.util.Map;

//pairs(["code", "bug"]) → {"b": "g", "c": "e"}
//pairs(["man", "moon", "main"]) → {"m": "n"}
//pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}

public class Main {
    public static void main(String[] args) {
        String[] string1 = {"code", "bug"};
        String[] string2 = {"man", "moon", "main"};
        String[] string3 = {"man", "moon", "good", "night"};
        Map<String,String> map = new HashMap<>();
        for (String str : string1) {
            map.put(("" + str.charAt(0)), "" + str.charAt(str.length()-1));
        }
        System.out.println(map);
    }
}
