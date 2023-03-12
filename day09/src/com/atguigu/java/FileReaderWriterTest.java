package com.atguigu.java;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FileReaderWriterTest {

    @Test
    public void testFileREader() throws IOException {
        File file = new File("hello.txt");

        FileReader fr = new FileReader(file);
        int data = fr.read();
        while (data!=-1){
            System.out.print((char)data);
            data = fr.read();
        }
        fr.close();
    }
    @Test
    public static void main(String[]args){
        String  a = "123,333,222,abc(12),666";
        List<String> c = Arrays.asList(a.split(","));
        String b = "123|abc\\(12\\)|222|333";
        for (String i : c ){
            if (!i.matches(b)){
                System.out.println(i);

            }
        }


    }

}
