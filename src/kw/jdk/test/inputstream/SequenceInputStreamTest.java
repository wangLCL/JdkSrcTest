package kw.jdk.test.inputstream;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceInputStreamTest {
    @Test
    public void sequenceTest() throws Exception {
        Vector<FileInputStream> streams = new Vector<>();
        FileInputStream inputStream = new FileInputStream(new File(".gitignore"));
        streams.add(inputStream);
        FileInputStream inputStream1 = new FileInputStream(new File("jdkSrcTest.iml"));
        streams.add(inputStream1);
        SequenceInputStream stream = new SequenceInputStream(streams.elements());
        int b;
        System.out.println();
        while ((b = stream.read()) != -1) {
            System.out.print((char) b);
        }
        System.out.println();

    }
}
