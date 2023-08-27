package kw.jdk.test.random;

import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomTest {
    @Test
    public void threadLocalTest01(){
        ThreadLocalRandom random = ThreadLocalRandom.current();
//        random.setSeed(100); //不支持
        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt(100));
        }
    }
}
