package org.IO.Serealization.Access;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

public class RandomAccess {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("Test.txt", "rw")) {
            String name = "Taras Shevchenko";
            String utf8 = new String(name.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
            raf.seek(raf.length() - 1);
            raf.writeBytes("\n\t\t\t\t" + utf8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // file information
        File file = new File("Test.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.isHidden());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
    }
}