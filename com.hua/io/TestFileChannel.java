package com.hua.io;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TestFileChannel {

    public static void main(String[] args) throws IOException {
        RandomAccessFile reader = new RandomAccessFile("/Users/hualiang/code/java-playground/fileOutputStream.txt", "rw");
        FileChannel fileChannel = reader.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        int read = fileChannel.read(byteBuffer);
        System.out.println(read);
    }
}
