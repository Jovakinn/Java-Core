package org.IO.Serealization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DeserializationEx {
    public static void main(String[] args) {
        List<String> employees;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("employees.bin"))){
            employees = (List<String>) objectInputStream.readObject();
            System.out.println(employees);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
