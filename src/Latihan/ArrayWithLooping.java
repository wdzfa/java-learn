package Latihan;

import java.util.Arrays;

public class ArrayWithLooping {

    public static void main(String[] args){

        int arrayAngka[] = {11,12,13,14,15,16};
//        System.out.println(Arrays.toString(arrayAngka));

        // looping sederhana
        System.out.println("Looping standart");
        for (int i=0; i<6; i++){
            System.out.println("Index ke-" + i + " = " + arrayAngka[i]);//akan out of bound jika lebih dr panjang array
        }

        // looping dengan property length
        System.out.println("Looping with length property");
        for (int i=0; i<arrayAngka.length; i++){
            System.out.println("Index ke-" + i + " = " + arrayAngka[i]);//akan out of bound jika lebih dr panjang array
        }

        // looping khusus untuk collection <- array
        System.out.println("Looping for each");
        for (int angka : arrayAngka){
            System.out.println(angka);
        }

    }
}
