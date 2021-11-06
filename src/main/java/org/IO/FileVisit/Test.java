package org.IO.FileVisit;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("TestCopy.txt");
        Path path = Paths.get(file.getAbsolutePath());
        Files.walkFileTree(path, new SuperFileVisitor());
    }
}
