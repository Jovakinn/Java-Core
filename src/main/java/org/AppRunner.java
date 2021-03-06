package org;

import org.Data.Human.Gender;
import org.objects.User;
import org.utils.DataKey;
import org.utils.UserDataRepresent;

import java.io.*;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Map;
import java.util.logging.Logger;

public class AppRunner implements Serializable {

    static void print2D(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    /**
     *
     * @return this must return a sorted array of integers using bubble sort
     */
    static int[] bubbleSort(int[] arr) {
        int sizeOfArr = arr.length;
        for (int i = 0; i < sizeOfArr - 1; i++) {
            for (int j = 0; j < sizeOfArr - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     *
     * @param arr representing array of integers
     * @param minimum minimum value of integers
     * @param maximum maximum value of integers
     * @param valueToFind value that has to be searched
     * @return have to return searching integer
     */
    public static int binarySearch(int[] arr, int minimum, int maximum, int valueToFind) {
        if (maximum >= 1) {
            int midValue = minimum + (maximum - 1) / 2;

            if (arr[midValue] == valueToFind) {
                return midValue;
            }

            if (arr[midValue] > valueToFind) {
                return binarySearch(arr, minimum, maximum - 1, valueToFind);
            }

            if (arr[midValue] < valueToFind) {
                return binarySearch(arr, minimum + 1, maximum, valueToFind);
            }
        }
        return -1;
    }

    public static final Logger LOGGER = Logger.getLogger(AppRunner.class.getName());

    public static void main(String[] args) throws NullPointerException, IOException {
        // Exceptions in Java

        File file = new File("testFile.txt");
        try (PrintWriter printWriter = new PrintWriter(new FileOutputStream(file))) {
            printWriter.println("CS is the best thing that had ever happened in my life :)");
        }


        //implementing equals() and hashCode() ---------------------------------
        Map<DataKey, Integer> dataKeyIntegerMap = DataKey.getAllData();
        DataKey dataKey = new DataKey();

        dataKey.setId(1);
        dataKey.setName("Silverman");

        LOGGER.info("Data key's hashcode is: " + dataKey.hashCode());
        Integer value = dataKeyIntegerMap.get(dataKey);
        LOGGER.info(String.valueOf(value));
        //-----------------------------------------------------------------------

        //User Max
        User userMax = new User("Max", "Khodakov",
                17, 11.0, Gender.MAlE,
                180.0, 75.0);
        UserDataRepresent.representDataset(userMax);

        // Date representations
        UserDataRepresent.representCurrentUserTime();

        int[][] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};

        print2D(mat);

        // Bubble sort implementation
        int[] array = {100, 64, 34, 25, 12, 22, 89, 3};
        printArray(bubbleSort(array));

        int n = 1;
        while (++n < 5) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0, k = 1; i < 5; i++, k += 2) {
            for (int j = 0; j < 5 - k / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // test binary search

        int[] testArray = {2, 3, 5, 89, 210, 720};
        int sizeOfTestArray = testArray.length;
        int numberToFind = 89;
        int resultOfBinarySearch = binarySearch(testArray, 0,
                sizeOfTestArray - 1, numberToFind);
        if (resultOfBinarySearch == -1) {
            LOGGER.severe("There is no such element");
        } else {
            LOGGER.info("Value found on index: " + resultOfBinarySearch);
        }


        // get Class metadata
        Class<AppRunner> appRunnerClass = AppRunner.class;

        LOGGER.info("Name of the class is: " + appRunnerClass.getName());
        LOGGER.info("Name of the super class is: " + appRunnerClass.getSuperclass().getName());

        int appRunnerModifiers = appRunnerClass.getModifiers();
        LOGGER.info("Modifiers of the class are: " + Modifier.toString(appRunnerModifiers));
    }
}