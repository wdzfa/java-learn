package Latihan;

import java.util.Scanner;

public class W52_ExceptionMethod {

    public static void main(String[] args) {


        int[] arrayData = {0,1,2,3};

        Scanner scanner = new Scanner(System.in);
        System.out.print("data ke-");
        int indexInput = scanner.nextInt();

        // Exception basic
        System.out.println("Exception Basic\n\n");
        try {
            System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, arrayData[indexInput]);
        } catch (Exception e){
            System.err.println("exception basic: Array out of bound");
        }

        // Exception dalam fungsi
        System.out.println("Exception dalam fungsi");
        int data = ambilDataArray(arrayData,indexInput);
        System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, data);

        // Exception throws by method
        System.out.println("Exception throws by method");
        int data2 = 0;
        try {
            data2 = ambilDataArray2(arrayData,indexInput);
        } catch (Exception e){
            System.err.println("exception throws by method: Array out of bound");
        }
        System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, data2);

        System.out.println("\n\nAkhir program");
    }
    private static int ambilDataArray2(int[] array, int index) throws Exception{
        int hasil = array[index];
        return hasil;
    }

    private static int ambilDataArray(int[] array, int index){
        int hasil = 0;
        try {
            hasil = array[index];
        } catch (Exception e){
            System.err.println("exception in function: Array out of bound");
        }
        return hasil;
    }

}
