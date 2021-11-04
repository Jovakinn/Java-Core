package org.IO.Serealization.Access;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

public class RandomAccess {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("Test.txt", "rw")) {
            String name = "Т.Г. Шевченко";
            String utf8 = new String(name.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
            raf.seek(raf.length() - 1);
            raf.writeBytes("\n\t\t\t\t" + utf8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}