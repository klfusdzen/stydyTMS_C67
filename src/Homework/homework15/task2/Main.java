package Homework.homework15.task2;

import java.util.HashMap;
import java.util.Map;

//pairs(["code", "bug"]) → {"b": "g", "c": "e"}
//pairs(["man", "moon", "main"]) → {"m": "n"}
//pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}

public class Main {
    Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap();
        for (String s : strings) {
            map.put(s.charAt(0) + "", s.charAt(s.length() - 1) + "");
        }
        return map;
    }
}
