package Latihan;

public class W32_ControlFlow {

    public static void main(String[] args){

        int a = 0;
        while (true){

            a++;
            if( a == 10){
                break;
                // ini untuk memaksa keluar dari loop
            }
            else if (a==5){
                continue;
                // ini untuk memaksa memulai loop lagi
            } else if (a==7){
                return;
            }
            System.out.println("Looping ke - " + a);
        }

        System.out.println("Akhir looping");
    }
}
