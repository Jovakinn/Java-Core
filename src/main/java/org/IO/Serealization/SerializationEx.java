package org.IO.Serealization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class SerializationEx {
    private static final Logger log = Logger.getLogger(SerializationEx.class.getName());

    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Max");
        employees.add("Jack");
        employees.add("Kevin");
        try (ObjectOutputStream objectOutputStream =
                     new ObjectOutputStream(new FileOutputStream("employees.bin"))) {
            objectOutputStream.writeObject(employees);
            log.info("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
