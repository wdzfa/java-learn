package Latihan;

import java.util.Arrays;

public class Array1 {

    public static void main(String[] args) {

        int[] arrayAngka1 = {1,2,3,4,5};

        // Array to string
        System.out.println("\nMerubah array menjadi string\n");
        printArray(arrayAngka1);

        // copy array (dgn benar)
        System.out.println("\nCopy array\n");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2); //akan menghasilkan 0 karna blm di copy

            // copy with loop
        System.out.println("copy with loop");
        for (int i=0; i < arrayAngka1.length; i++){
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1); // print address nya
        printArray(arrayAngka2);
        System.out.println(arrayAngka2); // akan beda memori dengan array 1

        System.out.println("\ncopy with copyOf");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1,3);
        printArray(arrayAngka1);
        printArray(arrayAngka3);

        System.out.println("\ncopy with range");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 2,5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);

        // fill array
        System.out.println("\nFill array");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5, 5); //menjadi deret array dengan nilai 5
        printArray(arrayAngka5);

        // komparasi array(membandingkan 2 buah array) dengan Arrays.equal
            // komparasi equals
        System.out.println("\nKomparasi array");
        int[] arrayAngka6 = {1,2,3,4,5};
        int[] arrayAngka7 = {1,2,3,4,5};

        System.out.println(Arrays.equals(arrayAngka6,arrayAngka7));

        if (arrayAngka6 == arrayAngka7){ //kalau cara ini yg terjadi adalah array tidak sama
            System.out.println("array ini sama");
        }else {
            System.out.println("array ini beda");
        }

            //komparasi array
        System.out.println("\nKomparasi array yg lebih besar");
        System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));

            //mismatch
        System.out.println("\nKomparasi index mana yang berbeda");
        System.out.println(Arrays.mismatch(arrayAngka6,arrayAngka7));

        //sort array untuk bisa search array dengan benar
        System.out.println("\nsort array");
        int[] arrayAngka8 = {1,6,4,5,3,5,2,6};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);


        System.out.println("\nsearch array");
        int angka = 2;
        int posisi = Arrays.binarySearch(arrayAngka8,angka);
        System.out.println("angka " + angka + " ada di index " + posisi);
    }

    private static void printArray(int[] dataArray){

        System.out.println(Arrays.toString(dataArray));

    }
}
