package Latihan;

import java.util.Scanner;

public class FibonacciWithRecursive {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai fibonacci: ");
        int nilai = scanner.nextInt();

        int fibonacci = nilaiFibonacci(nilai, "atas");
        System.out.println("Nilai fibonacci ke-" + nilai + " adalah " + fibonacci);
    }

    private static int nilaiFibonacci(int nilai, String pohon){
        System.out.println("pohon " + pohon);
        System.out.println("Fibonacci ke-" + nilai);
        // masukkan nilai yang static 0 1 1 2 3 yaitu 0 dan 1 awal

        if (nilai == 1 || nilai == 0){
            return nilai;
        } else {
            return nilaiFibonacci(nilai-1, "kiri") + nilaiFibonacci(nilai-2, "kanan");
        }
    }
}
