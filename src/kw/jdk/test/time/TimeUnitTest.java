package kw.jdk.test.time;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class TimeUnitTest {
    /**
     * 1.用来代替sleep，使得代码更加具有可读性
     * 2.时间转换
     *
     */
    @Test
    public void test01(){
//        try {
//            TimeUnit.HOURS.sleep(400);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println(TimeUnit.HOURS.toMillis(1));
    }
}
