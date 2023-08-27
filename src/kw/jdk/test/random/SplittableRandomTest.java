package kw.jdk.test.random;

import org.junit.Test;

import java.util.SplittableRandom;

public class SplittableRandomTest {
    /**
     * 种子是一直以一个间距增加的，这个只是线性的， 然后在对其求随机
     *
     *
     */
    @Test
    public void splittableRandomTest(){
        //支持自定义种子
        SplittableRandom splittableRandom = new SplittableRandom(1);
        for (int i = 0; i < 10; i++) {
            System.out.println(splittableRandom.nextInt());
        }
    }
}
