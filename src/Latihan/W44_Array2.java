package Latihan;

import java.util.Arrays;

public class W44_Array2 {

    public static void main(String[] args) {

        int[] array1 = {2,3,5,1,4,17,8,6,54,9};
        int[] array2 = {16,4,3,2,1,5,9,8,7,4};

        //penjumlahan 2 array
        System.out.println("Penjumlahan Array");
        int[] arrayHasil1 = tambahArray(array1,array2);
        printArray(array1,"array 1");
        printArray(array2,"array 2");
        printArray(arrayHasil1,"hasil");

        // Menggabungkan 2 buah array
        int[] arrayHasil2 = mergeArray(array1,array2);
        printArray(arrayHasil2,"hasil merge");

        // Sorting reverse, mengurutkan terbalik
        Arrays.sort(array1);
        printArray(array1, "sorted");
        reverse(array1);
        printArray(array1, "hasil reversed");

        Arrays.sort(array2);
        printArray(array2, "sorted 2");
        reverse2(array2);
        printArray(array2, "hasil reversed 2");

    }

    private static void reverse(int[] array1){ //menghasilkan array baru. reverse2 tidak

        int[] arrayHasil = Arrays.copyOf(array1, array1.length);

        for (int i = 0; i<array1.length; i++){
            array1[i] = arrayHasil[(arrayHasil.length - 1) - i];
        }
    }

    // tuker posisi, input 0 dengan input terakhir, input ke-1 dengan terakhir - 1
    private static void reverse2(int[] dataArray){
        Arrays.sort(dataArray);
        int buffer;

        for (int i = 0; i < dataArray.length/2; i++){
            buffer = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length -1) - i]; // dataArray yg setengah di depan
            // nilainya adalah data seteangah terakhir yg di taro depan
            dataArray[(dataArray.length -1) - i] = buffer; // dan setengah data terakhir
            // diisi dengan data yg di depan
        }
    }

    private static int[] mergeArray(int[] array1, int[] array2){

        int[] arrayHasil = new int[array1.length + array2.length];
        for (int i = 0; i<array1.length; i++){

            arrayHasil[i] = array1[i];

        }

        for (int i = 0; i <array2.length; i++){

            arrayHasil[i + array1.length] = array2[i];

        }

        return arrayHasil;
    }

    private static int[] tambahArray(int[] arrayInt1, int[] arrayInt2){

        int[] arrayHasil = new int[arrayInt1.length];
        for(int i = 0; i<arrayInt1.length; i++){
            arrayHasil[i] = arrayInt1[i] + arrayInt2[i];
        }
        return arrayHasil;
    }

    private static void printArray(int[] dataArray, String message){
        System.out.println(message + " = " + Arrays.toString(dataArray));
    }
}
