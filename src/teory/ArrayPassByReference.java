package teory;

import java.util.Arrays;

public class ArrayPassByReference {

    public static void main(String[] args){

        int[] arrayAngka1 = {1,2,3,4,5};
        int[] arrayAngka2 = new int[5];

        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        arrayAngka2 = arrayAngka1; //ini bukan mengkopi, tapi menjadikan array2 ke memori yg sama

        System.out.println("array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("array 1 -> " + Arrays.toString(arrayAngka1));

        arrayAngka1[0] = 100;
        arrayAngka2[4] = 400;  //Alhasil jika ada perubahan nilai array maka kedua nya akan terubah
        // bukan salah satu aja

        System.out.println("array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("array 1 -> " + Arrays.toString(arrayAngka1));

    }
}
