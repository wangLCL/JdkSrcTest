package kw.jdk.test.exception;

import org.junit.Test;

/**
 * 他是异常体系的父类
 * 异常体系包含了异常和错误
 * - 异常又包含了运行时异常  可以不进行捕获
 * - 检查异常：除运行时异常之外的异常，或称检查异常；这类异常意味着程序出现错误时可能是允许被恢复的，需要在编译期就捕获，否则无法编译
 *
 * 收集调用栈  打印异常信息
 *
 * 异常体系源码确实没啥可以说的
 */
public class ThrowableTest {
    @Test
    public void throwTraceTest(){
        Throwable throwable = new Throwable();
        System.out.println(throwable.getStackTrace());
        for (StackTraceElement stackTraceElement : throwable.getStackTrace()) {
            System.out.println(stackTraceElement.getClassName());
        }

    }


}
