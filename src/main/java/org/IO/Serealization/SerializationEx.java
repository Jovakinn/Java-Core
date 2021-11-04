package org.IO.Serealization;

import org.IO.Serealization.models.Employees;

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
        Employees employee = new Employees("Wade", "Jackson", 27, 12000.0);
        try (ObjectOutputStream objectOutputStream =
                     new ObjectOutputStream(new FileOutputStream("employees.bin"))) {
            objectOutputStream.writeObject(employee);
            objectOutputStream.writeObject(employees);
            log.info("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
