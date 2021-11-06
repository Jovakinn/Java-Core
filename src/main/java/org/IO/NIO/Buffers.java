package org.IO.NIO;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Buffers {
    public static void main(String[] args) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("TestCopy.txt", "r");
             FileChannel fileChannel = randomAccessFile.getChannel()) {

            ByteBuffer byteBuffer = ByteBuffer.allocate(1000);
            fileChannel.read(byteBuffer);
            byteBuffer.flip();

            while (byteBuffer.hasRemaining()){
                System.out.print((char) byteBuffer.get());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
