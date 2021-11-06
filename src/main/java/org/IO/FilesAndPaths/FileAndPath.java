package org.IO.FilesAndPaths;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class FileAndPath {
    public static void main(String[] args) {
        Path pathTestCopy = Paths.get("TestCopy.txt");
        Path pathTest = Paths.get("Test.txt");

        System.out.println(pathTest.toAbsolutePath());
        System.out.println(pathTestCopy.toFile());
        System.out.println(pathTest.getParent());
        System.out.println(pathTestCopy.getRoot());
        try {
            System.out.println(Files.isSameFile(pathTest, pathTestCopy));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Map<String, Object> attributes = Files.readAttributes(pathTest, "*");
            for (Map.Entry<String, Object> entry: attributes.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
