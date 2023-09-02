package kw.jdk.test.arraylist;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    @Test
    public void hashSetTest(){
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("sss");
        Iterator<String> iterator = stringHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
