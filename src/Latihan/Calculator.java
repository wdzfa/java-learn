package Latihan;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

         float a,b,hasil;
         char operator;

        Scanner scan = new Scanner(System.in);
        System.out.print("Nilai a: ");
        a = scan.nextFloat();
        System.out.print("operator: ");
        operator = scan.next().charAt(0);
        System.out.print("Nilai b: ");
        b = scan.nextFloat();

        System.out.println("input user: " + a + " " + operator + " " + b);

        hasil = 0;
        if (operator == '+'){
            hasil = a + b;
        } else if( operator == '-'){
            hasil = a - b;
        } else if( operator == '*'){
            hasil = a * b;
        } else if( operator == '/'){
            if( b == 0){
                System.out.println("Pembagi 0 mengahasilkan nilai tak hingga");
            }
            hasil = a / b;
        } else {
            System.out.println("Operator tidak ditemukan");
        }

        System.out.println("Hasil: " + hasil);
    }
}
