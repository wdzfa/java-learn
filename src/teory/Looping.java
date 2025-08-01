package teory;

public class Looping {

    public static void main(String[] args){

        // While // Do While // For

        // 1. While
        int a = 0;
        boolean kondisi = true;

        System.out.println("Awal program");
        while (kondisi){
            System.out.println("while loop ke-" + a);
            a++;

            if (a == 10){
                kondisi = false;
            }
        }
        System.out.println("Akhir program"); //tidak akan bisa di cetak kalau while(true) karna loop akan berputar terus
        // tapi jika while(kondisi) bisa di cetak


        // --------------------------------------------------------------------------------------------------


        // 2. Do While
        int b = 0;
        System.out.println("Awal program");

        // A.
        do {
            b++;
            System.out.println("do while ke-" + b);
            // di eksekusi setidaknya sekali
        } while (false);

        // B.
        boolean moment = true;
        do {
            b++;
            System.out.println("do while ke-" + b);
            // di eksekusi setidaknya sekali maka yang awal nya 0 akan ditambah 1 sehingga angka awal yg dicetak = 1
            if ( b == 2){
                moment = false;
            }

        } while (moment);
        System.out.println("Akhir program");


        // --------------------------------------------------------------------------------------------------


        // For loop
        /* for(insialisasi; kondisi; step_nilai){
            step aksi
        } */

        System.out.println("Awal program");

        // Increment
        for (int nilai = 0; nilai <= 10; nilai++){
            System.out.println("for loop ke-" + nilai);
        }
        System.out.println("Akhir program");


        // Decrement
        for (int nilai = 10; nilai >= 5; nilai--){
            System.out.println("for loop ke-" + nilai);
        }
        System.out.println("Akhir program");
    }
}
