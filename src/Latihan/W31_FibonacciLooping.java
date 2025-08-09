package Latihan;

import java.util.Scanner;

public class W31_FibonacciLooping {

    public static void main(String[] args){

        int f_n, f_n_1, f_n_2, i,n;
        boolean kondisi = true;

        Scanner scanner = new Scanner(System.in);

        // Beri rumus dahulu
        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        // 1. For Loop

//        for (i = 1; i <= 10; i++){
//
//            System.out.printf("nilai n ke-%d = %d\n",i, f_n);
//
//            f_n = f_n_1 + f_n_2;
//            f_n_2 = f_n_1;
//            f_n_1 = f_n;
//
//        }

        // 2. While Loop

//        i = 1;
//        while (i<=10){
//            System.out.printf("nilai ke-%d = %d\n",i, f_n);
//            f_n = f_n_1 + f_n_2;
//            f_n_2 = f_n_1;
//            f_n_1 = f_n;
//            i++;
//        }

        // 3. Do While
        System.out.print("Fibonacci : ");
        n = scanner.nextInt();
        i = 1;
        do {
            System.out.printf("nilai ke-%d = %d\n",i, f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;

            if(i == n){
                kondisi = false;
            }
            i++;
        }while (kondisi);

    }
}
