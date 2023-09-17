package kw.jdk.test.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("1","1");
        for (String s : map.keySet()) {
            System.out.println(s);
        }

        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry.getKey()+"  "+stringStringEntry.getValue());
        }

        for (String value : map.values()) {
            System.out.println(value);
        }
    }
}
