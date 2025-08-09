package Latihan;

public class W49_StringOperation {

    public static void main(String[] args) {

        String kalimat = "Saya suka makan pisang";

        // Mengambil komponen dari spring
        System.out.println(kalimat.charAt(5));

        // Substring
        String kata = kalimat.substring(10,15);
        System.out.println(kata);

        // Concatenation (concat)
        String kalimat2 = kata + " bakwan";
        System.out.println(kalimat2);

        kata = kata + " cireng";
        System.out.println(kata);

        // concat dengan non string
        int jumlah = 20;
        String kalimat3 = kata + " " + jumlah; //casting
        System.out.println(kalimat3);
        System.out.println(kata + " " + jumlah);

        // Lowercase dan uppercase
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());

        // Replace
        String kalimat4 = kalimat.replace("pisang","combro");
        System.out.println(kalimat);
        System.out.println(kalimat4);

        // Equality(persamaan)
        String kataInput = "test"; // ada di string poll
//        String kataInput = new String("test"); //ini bukan string leteral, shg tidak sama
        String kataTest = "test";
        System.out.println("Persamaan pada lokasi string pool");
        if (kataInput == kataTest){ // mengecek address/memori bukan isi nya
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }

        // Comparasi
        String motor1 = "royal enfield himalayan";
        String motor2 = "kawasaki w175";
        System.out.println(motor1.compareTo(motor2)); //klmnopqr = 7
        System.out.println(motor1.compareTo(motor1)); //= -7

        String gorengan1 = "bakwan";
        String gorengan2 = "bala-bala";
        System.out.println(gorengan1.compareTo(gorengan2)); // = -1(ba k, ba l) ba tidak dilihat, yg dilihat adalah l ke k

    }
}
