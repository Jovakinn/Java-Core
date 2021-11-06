package org.IO.NIO;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("Test.txt", "rw");
            FileChannel fileChannel = raf.getChannel()) {
            ByteBuffer byteBuffer = ByteBuffer.allocate(25);
            StringBuilder stringBuilder = new StringBuilder();

            int bytesRead = fileChannel.read(byteBuffer);
            while (bytesRead > 0) {
                System.out.println("Read " + bytesRead);
                byteBuffer.flip();
                while (byteBuffer.hasRemaining()) {
                    stringBuilder.append((char) byteBuffer.get());
                }
                byteBuffer.clear();
                bytesRead = fileChannel.read(byteBuffer);
            }
            System.out.println(stringBuilder);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
