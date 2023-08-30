package kw.jdk.test.arraylist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    @Test
    public void arrayListTest(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        Iterator<Integer> iterator = arrayList.iterator();
        iterator.remove(); //error
    }
}
