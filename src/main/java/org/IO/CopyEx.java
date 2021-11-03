package org.IO;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Logger;

public class CopyEx {
    private static final Logger log = Logger.getLogger(CopyEx.class.getName());

    public static void main(String[] args) {
        File from = new File("Test.txt");
        File to = new File("TestCopy.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(from));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(to));
             Scanner scan = new Scanner(bufferedReader)) {

            while (scan.hasNextLine()) {
                bufferedWriter.write(scan.nextLine());
                bufferedWriter.write("\n");
            }
            log.info("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
