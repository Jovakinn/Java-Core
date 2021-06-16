package org;

import org.Data.Human.Gender;
import org.objects.User;
import org.utils.UserDataRepresent;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

public class AppRunner {

    static void print2D(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    static void printArray(int[] arr){
        int sizeOfArray = arr.length;
        for (int i = 0; i < sizeOfArray; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static int[] bubbleSort(int[] arr) {
        int sizeOfArr = arr.length;
        for (int i = 0; i < sizeOfArr - 1; i++){
            for (int j = 0; j < sizeOfArr - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static final Logger LOGGER = Logger.getLogger(AppRunner.class.getName());

    public static void main(String[] args) throws IOException {
        // User Nastya
        User userNastya = new User("Nastya", "Borodai",
                17, 11.0, Gender.FEMALE,
                170.0, 62.0);
        UserDataRepresent.representDataset(userNastya);
        //User Max
        User userMax = new User("Max", "Khodakov",
                17, 11.0, Gender.MAlE,
                180.0, 75.0);
        UserDataRepresent.representDataset(userMax);

        // Date representations
        UserDataRepresent.representCurrentUserTime();

        int mat[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 } };

        print2D(mat);

        // Bubble sort implementation
        int array[] = {100 ,64, 34, 25, 12, 22, 89, 3};
        printArray(bubbleSort(array));

    }
}