package Latihan;

import java.util.Arrays;

public class Array3 {

    public static void main(String[] args) {

        // Array multi dimensi

        int[][] array_2D = {
                {1,2},
                {3,4}
        };
        System.out.println("Original print (deeply string)");
        printArray(array_2D);
        printArray2(array_2D);

        // cara membuat array 2 dimensi dengan deklarasi
        // int[baris][kolom]
        System.out.println("Looping with (toString)");
        int[][] array1 = new int[5][4];
        printArray2(array1);

        System.out.println("Looping manual");
        int[][] array2 = new int[5][4];
        printArray3(array2);

        System.out.println("For each loop");
        int[][] array3 = new int[5][4];
        printArray4(array3);

        //Array manual untuk pembuktian
        System.out.println("Case 1");
        int[][] array_2D_2 = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };
        printArray4(array_2D_2);

        System.out.println("Case 2(Different length");
        int[][] array_2D_3 = {
                {1,2,3,4},
                {6,7,8,9,10},
                {11,12}
        };
        printArray4(array_2D_3);

    }

    // Without looping (use deeply string)
    private static void printArray (int[][] dataArray){
        System.out.println(Arrays.deepToString(dataArray));
    }

    // Looping with only toString
    private static void printArray2 (int[][] dataArray){
        for (int i = 0; i < dataArray.length; i++){
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }

    // Looping lengkap manual
    private static void printArray3 (int[][] dataArray){
        for (int i = 0; i < dataArray.length; i++){
            System.out.print("[");
            for (int j = 0; j <dataArray[i].length; j++) {
                System.out.print(dataArray[i][j] + ",");
            }
            System.out.print("]\n");
        }
    }

    // Use for each
    private static void printArray4 (int[][] dataArray){
        for (int[] baris: dataArray){
            System.out.print("[");
            for (int angka: baris){
                System.out.print(angka + ",");
            }
            System.out.print("]\n");
        }
    }


}
