package kw.jdk.test.string;

import org.junit.Test;

public class StringTest {
    @Test
    public void stringTest(){
        String str = "abcd";
        System.out.println(str.codePointAt(0));
        System.out.println(str.codePointBefore(3));
    }
}
