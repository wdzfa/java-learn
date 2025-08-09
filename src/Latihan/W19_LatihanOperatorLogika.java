package Latihan;

import java.util.Scanner;

public class W19_LatihanOperatorLogika {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("Masukkan nilai tebakan: ");
        nilaiTebakan = scan.nextInt();
        statusTebakan = (nilaiBenar == nilaiTebakan);
        System.out.println(statusTebakan);

        // Operasi Aljabar boolean (AND/OR)
        for (int i = 0; i<=10; i++) {
            System.out.println("Masukkan nilai antara 4 dan 9: (tekan -1 jika ingin mengakhiri iterasi)");
            nilaiTebakan = scan.nextInt();
            if(nilaiTebakan == -1){
                break;
            }
            statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
            System.out.println("Status tebakan anda: " + statusTebakan);

        }

    }
}
