package Latihan;

import java.util.Scanner;

public class SimpleLooping {

    public static void main(String[] args){

        // program untuk menjumlahkan angka dengan rentang

        int nilai_awal, nilai_akhir, total;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input nilai awal: ");
        nilai_awal = scanner.nextInt();
        System.out.print("Input nilai akhir: ");
        nilai_akhir = scanner.nextInt();

        total = 0;

        while (nilai_awal <= nilai_akhir){

            total = total + nilai_awal;
            System.out.printf("f(%d) ", nilai_awal);

            int total_sebelumnya = total - nilai_awal;
            System.out.println(" = " + nilai_awal + " Ditambah " + total_sebelumnya + " = " + total);

            nilai_awal++;
        }

    }
}
