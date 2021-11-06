package org.IO.NIO;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class ChannelBufferEx {

    private static final String text = """
            When I am dead, bury me
            In my beloved Ukraine,
            My tomb upon a grave mound high
            Amid the spreading plain,
            So that the fields, the boundless steppes,
            The Dnieper's plunging shore
            My eyes could see, my ears could hear
            The mighty river roar.

            When from Ukraine the Dnieper bears
            Into the deep blue sea
            The blood of foes ... then will I leave
            These hills and fertile fields —
            I'll leave them all and fly away
            To the abode of God,
            And then I'll pray .... But till that day
            I nothing know of God.

            Oh bury me, then rise ye up
            And break your heavy chains
            And water with the tyrants' blood
            The freedom you have gained.
            And in the great new family,
            The family of the free,
            With softly spoken, kindly word
            Remember also me.""";

    private static final String superText = "Putin Huilo!!! La la la la laa laa! Glory to Ukraine!" +
            " Glory to Heroes !!!";

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

            ByteBuffer byteBuffer1 = ByteBuffer.allocate(text.getBytes().length);
            byteBuffer1.put(text.getBytes(StandardCharsets.UTF_8));
            byteBuffer1.flip();
            fileChannel.write(byteBuffer1);

            ByteBuffer superBuffer = ByteBuffer.wrap(superText.getBytes());
            fileChannel.write(superBuffer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
