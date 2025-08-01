package Latihan;

import java.util.Scanner;

public class Latihan2 {

    public static void main(String[] args){

        // Switch Case Learn

        Scanner scan = new Scanner(System.in);
        String input;

        System.out.print("Panggil nama: ");
        input = scan.next();

        switch (input){
            case "otong":
                System.out.println("Saya otong dan hadirr");
                break;
            case "ucup":
                System.out.println("Saya ucup dan hadirr");
                break;
            default:
                System.out.println(input + " Tidak hadir");
        }

        // jika tidak pakai break: jika case awal bernilai true maka seluruh
        // case/default setelahnya akan dijalankan (tetep kalau case setelahnya mengandung break maka
        // default tidak dapat berjalan

    }
}
