package Latihan;

import java.util.Scanner;

public class W24_TernaryOperator {

    // Ternary Operator
    public static void main(String[] args){

        // variable x = ekspresi ? statement_true : statement_false

        int input,x;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input value: "); // tidak perlu print input scanner lagi
        input = scanner.nextInt();

        x = (input == 10)? input*input : input/2;
        System.out.println("Hasil: " + x);

        //jika pakai if else
        if (input==10){
            x = input*input;
        }
        else {
            x = input/2;
        }
        System.out.println("Result (use if else): " + x);
    }
}
