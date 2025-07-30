public class Unary {

    public static void main(String args[]){

//        unary decrement dan incremennt
        int angka = 10;
        angka++; //hasilnya 11
        angka++; // hasilnya 12 (++ sebanyak 2x)
        System.out.println("nilai dengan '++' menjadi = " + angka);

        int angka2 = 10;
        angka2--;
        System.out.println("nilai dengan '--' menjadi = " + angka2);

//        prefix dan postfix
        int a = 5;
        // hasilnya = 6
        System.out.printf("nilai dengan '--' prefix menjadi = %d\n", ++a);  // a ditambah 1 kemudian ditampilkan

        int b = 5;
        // hasilnya = 5
        System.out.printf("nilai dengan '--' postfix menjadi = %d\n", b++);  // b ditampilkan dulu kemudian ditambah
        // saat nilai b dicetak lagi, hasilnya = 6
        System.out.printf("nilai postfix menjadi = %d\n", b);  // b setelah sebelumnya ditampilkan

    }
}
