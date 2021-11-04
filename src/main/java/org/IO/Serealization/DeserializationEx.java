package org.IO.Serealization;

import org.IO.Serealization.models.Employees;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEx {
    public static void main(String[] args) {
        Employees returnEmployeesFromBinaryFile;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("employees.bin"))){
            returnEmployeesFromBinaryFile = (Employees) objectInputStream.readObject();
            System.out.println(returnEmployeesFromBinaryFile);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
