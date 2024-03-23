package com.lyw.test;



import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
public class Demo01 {
        public static void main(String[] args) throws IOException {
                System.out.println(new File(" ").getAbsolutePath());
                InputStream inputStream = new FileInputStream("test.txt");
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("GBK"));
                char[] charBuffer = new char[20];
                int read = inputStreamReader.read(charBuffer, 0, 20);
                System.out.println(String.valueOf(charBuffer,0,read));

        }
}
