package kw.jdk.test.bytestream;

import org.junit.Test;

import java.io.IOException;
import java.io.StringBufferInputStream;

public class StringBufferInputStreamTest {
    @Test
    public void stringStream(){
        StringBufferInputStream inputStream = new StringBufferInputStream("abcdef");
        //有效个数
        System.out.println(inputStream.available());
        //读取一个
        System.out.println(inputStream.read());
        //读取数组大小
        byte[] bytes = new byte[3];
        try {
            inputStream.read(bytes);
            System.out.println(new String(bytes));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
