package Latihan;

import java.util.Scanner;

public class Calculator1 {

    public static void main(String[] args){

        // Menggunakan switch case

        float a,b,hasil;
        String operator;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nilai a: ");
        a = scanner.nextFloat();
        System.out.print("Operator: ");
        operator = scanner.next();
        System.out.print("Nilai b: ");
        b = scanner.nextFloat();

        switch (operator){
            case "+":
                hasil = a + b;
                System.out.println("Hasil = " + hasil);
                break;
            case "-":
                hasil = a - b;
                System.out.println("Hasil = " + hasil);
                break;
            case "*":
                hasil = a * b;
                System.out.println("Hasil = " + hasil);
                break;
            case "/":
                hasil = a / b;
                System.out.println("Hasil = " + hasil);
                break;
            default:
                System.out.println("Operator " + operator + " tidak ditemukan");
        }

    }
}
