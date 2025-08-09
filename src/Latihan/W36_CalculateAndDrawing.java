package Latihan;

import java.util.Scanner;

public class W36_CalculateAndDrawing {

    public static void main(String[] args){

        // 1.
//        int panjang, lebar;
//        panjang = 5;
//        lebar = 4;

//        for(int i = 0; i < lebar; i++){
//            for(int j = 0; j < panjang; j++){
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }


        // 2.
        Scanner scanner = new Scanner(System.in);
          // Agar bisa berulang masukkan while

        boolean kondisi = true;
        while (kondisi) {
            System.out.print("Panjang = ");
            int panjang = scanner.nextInt();
            System.out.print("Lebar = ");
            int lebar = scanner.nextInt();

//            System.out.println("Input -1 jika ingin mengakhiri progarm");
//
//            if(panjang == -1 || lebar == -1){
//                kondisi = false;
//            }

            gambar(panjang, lebar);

//            System.out.println("Luas = " + luas(panjang,lebar));
//            System.out.println("Keliling = " + keliling(panjang,lebar));

            hitungKelilingDanLuas(panjang, lebar);

        }
    }

    public static void hitungKelilingDanLuas(int panjang, int lebar){

        System.out.println("Luas = " + luas(panjang,lebar));
        System.out.println("Keliling = " + keliling(panjang,lebar));

    }

    public static void gambar (int panjang, int lebar){

        for(int i = 0; i < lebar; i++){
            for(int j = 0; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }

    private static int luas (int panjang, int lebar){

        int hasil = panjang * lebar;
        return hasil;
    }

    private static int keliling(int panjang, int lebar){

        int hasil = (panjang + lebar) * 2;
        return hasil;
    }
}
