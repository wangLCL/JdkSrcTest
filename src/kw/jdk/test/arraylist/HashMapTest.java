package kw.jdk.test.arraylist;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapTest {
    @Test
    public void hashMapTest(){
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("xx","xx");
        for (String s : hashMap.keySet()) {

        }

        Set<String> strings = hashMap.keySet();

    }
}
