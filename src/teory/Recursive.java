package teory;

import java.util.Scanner;

public class Recursive {

    public static void main(String[] args){

        // Recursive = cara lain perulangan tanpa while/loop
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();

        printNilai(nilai);

        int jumlah = jumlahNilai(nilai);
        System.out.println("Jumlah = " + jumlah);

        int hasil_factorial = factorial(nilai);
        System.out.println("hasil factorial = " + hasil_factorial);
    }

    private static void printNilai(int parameter){
        // program untuk mencetak nilai hingga 0
        System.out.println("Nilai = " + parameter);

        if (parameter == 0){
            return;
        }

        parameter--;
        printNilai(parameter);
    }

    public static int jumlahNilai(int parameter){

        // program untuk menjumlahkan nilai
        System.out.println("Parameter: " + parameter);
        if (parameter == 0){
            return parameter;
        }
        return parameter + jumlahNilai(parameter - 1);
    }

    // Factorial (5! = 5 x 4 x 3 x 2 x 1)
    private static int factorial(int parameter){
        // program untuk menjumlahkan nilai
        System.out.println("Parameter: " + parameter);
        if (parameter == 1){
            return parameter;
        }
        return parameter * factorial(parameter - 1);
    }

}
