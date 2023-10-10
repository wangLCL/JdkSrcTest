package kw.jdk.test.io;

import org.junit.Test;

public class BitTest {
    @Test
    public void booleanTest(){
        byte[] bytes = new byte[1];
        bytes[0] = 23;
        System.out.println(bytes[0] != 0);
    }

    @Test
    public void charTest(){
        byte[] bytes = new byte[2];
        bytes[0] = 23;
        bytes[1] = 34;
        int c = bytes[1] & 0xff + bytes[0] << 8;

        int i = bytes[3] & 0xff +
                bytes[2] & 0xff << 8 +
                bytes[1] & 0xff << 16 +
                bytes[0] << 24;
    }
}
