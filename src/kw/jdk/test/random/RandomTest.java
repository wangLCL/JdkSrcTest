package kw.jdk.test.random;

import org.junit.Test;

import java.util.Random;

/**
 * 多线程下效率比较低
 */
public class RandomTest {
    /**
     * 伪随机   每次执行的结果都是一样的
     */
    @Test
    public void genRandomNum() {
        {
            Random random = new Random(100);
            System.out.println(random.nextDouble());
            System.out.println(random.nextDouble());
            System.out.println(random.nextDouble());
            System.out.println(random.nextDouble());
            System.out.println(random.nextDouble());
            System.out.println(random.nextDouble());
        }
        {
            Random random = new Random(100);
            System.out.println(random.nextDouble());
            System.out.println(random.nextDouble());
            System.out.println(random.nextDouble());
            System.out.println(random.nextDouble());
            System.out.println(random.nextDouble());
            System.out.println(random.nextDouble());
        }


    }

    @Test
    public void otherMarthod(){
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
        }
        System.out.println("---------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(10));
        }

    }

    @Test
    public void forTest(){
//        for (int rnd = 1, n = Math.min(len - i, Integer.SIZE/Byte.SIZE);
        Random random = new Random();
        byte[] bytes = new byte[10];
        random.nextBytes(bytes);
    }
}
