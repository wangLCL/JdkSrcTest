package kw.jdk.test.file;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileTest {
    @Test
    public void fileTest() throws Exception {
        File file = new File(".gitignore");
//        System.out.println(file.getAbsoluteFile());
//        System.out.println(file.getParent());

        FileInputStream inputStream = new FileInputStream(file);
        System.out.println(inputStream.read());


        //FileReader构造是一个FileInputStream
        FileReader reader = new FileReader(file);
        System.out.println(reader.read());
    }
}
