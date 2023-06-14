package ch01;

import java.io.IOException;
import java.io.InputStream;

public class ByteStreamExam1 {
    public static void main(String[] args) {
        InputStream is = System.in;
        byte[] b = new byte[1024];
        int len = 0;

        try {
            len = is.read(b);
            System.out.write(b, 0, len);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
