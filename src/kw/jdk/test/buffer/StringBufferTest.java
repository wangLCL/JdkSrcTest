package kw.jdk.test.buffer;

import org.junit.Test;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

public class StringBufferTest {
    @Test
    public void stringBufferTest(){
        ByteBuffer allocate = ByteBuffer.allocate(10);
        allocate.put(new byte[]{
                1,2,3,4
        });
        ShortBuffer shortBuffer = allocate.asShortBuffer();
        System.out.println(shortBuffer);
    }
}
