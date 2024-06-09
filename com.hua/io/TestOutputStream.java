package com.hua.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TestOutputStream {
    public static void main(String[] args) throws FileNotFoundException {
        try (FileOutputStream fileOutputStream = new FileOutputStream("fileOutputStream.txt")) {
            fileOutputStream.write("1st: Hello Hua\n".getBytes(StandardCharsets.UTF_8));
            fileOutputStream.write("2nd: Hello world".getBytes(StandardCharsets.UTF_8));
//            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
//            dataOutputStream.writeBoolean(true);
//            dataOutputStream.writeLong(12312312312l);
//            dataOutputStream.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(FileReader fileReader = new FileReader("fileOutputStream.txt")) {
            int content;
            fileReader.skip(5);
            while((content = fileReader.read())!= -1){
                System.out.print((char) content);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
