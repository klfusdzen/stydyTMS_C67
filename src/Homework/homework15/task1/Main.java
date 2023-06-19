package Homework.homework15.task1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] string1 = {"a", "b", "a", "c", "b"};
        String[] string2 = {"c", "b", "a"};
        String[] string3 = {"c", "c", "c", "c"};
        Map<String,Boolean> map = new HashMap<>();
        for(String str : string2){
            if (map.containsKey(str)){
                map.replace(str, true);
            }else{
                map.put(str, false);
            }
        }
        System.out.println(map);
    }
}