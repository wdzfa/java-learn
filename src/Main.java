//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int var1 = 10;
        int var2 = 3;

        int hasil;
        hasil = var1 + var2;
        System.out.printf("%d + %d = %d\n", var1,var2,hasil);

//        modulus
        hasil = var1 % var1;
        System.out.printf("%d %% %d = %d\n", var1,var2,hasil);

//        casting pembagian
//        jika salah 1 inputan mengandung float hasil akan sesuai 2.5 (float)
//        namun jika int/int dia akan mengembalikan hanya int 2
        int a = 10;
        float b = 4;

        float c = a/b;
        System.out.printf("%d / %f = %f\n", a,b,c); //%d untuk desimal %f untuk mengembalikan nilai float
//        cara lain

        int x = 10;
        int y = 4;

        float z = (float) x/y;
        System.out.printf("%d / %d = %f\n", x,y,z);

    }
}