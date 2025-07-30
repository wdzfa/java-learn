package Latihan;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

//        int input = userInput.nextInt();
//        System.out.println("input =" +input);
        System.out.println("=====MENGHITUNG LUAS");
        System.out.print("panjang = ");
        int panjang = scan.nextInt();
        System.out.print("lebar = ");
        int lebar = scan.nextInt();

        int luas = panjang * lebar;
        System.out.println(luas);

        System.out.println("=====MENGHITUNG LUAS");
        System.out.print("tinggi = ");
        int tinggi = scan.nextInt();
        System.out.println("volume = " + luas*tinggi);
    }
}
