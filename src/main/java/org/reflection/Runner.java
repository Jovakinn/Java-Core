package org.reflection;

import org.reflection.Departments.Department;
import org.reflection.model.Calculator;
import org.reflection.model.Employee;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class Runner {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException,
            InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class employeeClass = Employee.class;
        employeeClass.getDeclaredField("id");

        Field someField = employeeClass.getDeclaredField("id");
        System.out.println("Type of id = " + someField.getType());

        Field[] fields = employeeClass.getFields();
        for (Field field: fields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }

        Constructor constructor1 = employeeClass.getConstructor(Integer.class, String.class, Department.IT.getClass());
        Object object = constructor1.newInstance(5, "Max", Department.IT);
        System.out.println(object);

        // check reflection calculator
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("TestReflection.txt"))) {
         String methodName = bufferedReader.readLine();
         String firstArgument = bufferedReader.readLine();
         String secondArgument = bufferedReader.readLine();

         Calculator calculator = new Calculator();
         Class cl = calculator.getClass();
         Method method = null;

         Method[] methods = cl.getDeclaredMethods();
            for (Method myMethod : methods) {
                if (myMethod.getName().equals(methodName)){
                    method = myMethod;
                }
            }
            method.invoke(calculator,
                    Integer.parseInt(firstArgument), Integer.parseInt(secondArgument));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
