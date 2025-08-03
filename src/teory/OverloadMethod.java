package teory;

public class OverloadMethod {

    // Overload = menggunakan nama method yang sama tapi dengan argument yang beda

    public static void main(String[] args){

        printAngka(3);
        printAngka(10.0f);
        printAngka(16.7d);
        float hasilFloat = jumlah(10.5f,8);
        printAngka(hasilFloat);

    }

    private static void printAngka(int angka){
        System.out.println("Angka ini adalah integer dengan nilai: " + angka);
    }
    private static void printAngka(float angka){
        System.out.println("Angka ini adalah float dengan nilai: " + angka);
    }
    private static void printAngka(double angka){
        System.out.println("Angka ini adalah double dengan nilai: " + angka);
    }
    private static int jumlah(int angka1, int angka2){
        return angka1 + angka2;
    }
    private static float jumlah(float angka1, int angka2){
        return angka1 + angka2;
    }
    private static float jumlah(int angka1, float angka2){
        return angka1 + angka2;
    }
}
