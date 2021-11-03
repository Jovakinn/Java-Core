package org.IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class ReadFromFile {
    private static final Logger log = Logger.getLogger(ReadFromFile.class.getName());

    public static void main(String[] args) {
        File file = new File("Test.txt");
        try (FileReader fileReader = new FileReader(file)) {
            Scanner scan = new Scanner(fileReader);

            int i = 1;

            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
                i++;
            }
            log.info("Successfully done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}