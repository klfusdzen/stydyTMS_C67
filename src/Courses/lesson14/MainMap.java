package Courses.lesson14;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class MainMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("FirstKey", 1);
        map.put("SecondKey", 2);
        System.out.println(map);
        System.out.println(map.get("FirstKey"));
        System.out.println(map.containsKey("123"));
        System.out.println(map.containsValue(1));
        map.remove("FirstKey", 1);
        System.out.println(map);
        map.size();
        map.values();
    }
}
