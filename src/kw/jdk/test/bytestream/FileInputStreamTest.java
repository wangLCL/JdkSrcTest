package kw.jdk.test.bytestream;

import org.junit.Test;
import sun.nio.ch.SelChImpl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.channels.FileChannel;

/**
 * 字符来源于文件
 *
 * 文件句柄是传给channel使用的
 */
public class FileInputStreamTest {
    @Test
    public void test01(){
        try {
            FileInputStream fileInputStream = new FileInputStream(".gitignore");
            System.out.println(fileInputStream.read());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
