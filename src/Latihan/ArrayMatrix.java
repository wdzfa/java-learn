package Latihan;

public class ArrayMatrix {

    public static void main(String[] args) {

        int[][] matrix_a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] matrix_b = {
                {11,12,13},
                {14,15,16},
                {17,18,19}
        };
//        printArray(matrix_a);
//        printArray(matrix_b);

        int[][] hasilTambah = tambah(matrix_a,matrix_b);
        printArray(hasilTambah);

        int[][] matrix_c = {
                {1,2},
                {3,4},
                {5,6}

        };

        int[][] matrix_d = {
                {11,12},
                {13,14}
        };

        // Perkalian matrix
        int [][] hasilKali = kali(matrix_c,matrix_d);
        printArray(hasilKali);

    }

    private static int[][] kali(int[][] matrix1, int[][] matrix2){

        int baris_1 = matrix1.length;
        int kolom_1 = matrix1[0].length;

        int baris_2 = matrix2.length;
        int kolom_2 = matrix2[0].length;

        int[][] hasil = new int[baris_1][kolom_2];
        int buffer;
        for (int i = 0; i < baris_1; i++){
            for (int j = 0; j < kolom_2; j++){
                buffer = 0;
                for (int k = 0; k < kolom_1; k++){
                    buffer += matrix1[i][k] * matrix2[k][j];
                }
                hasil[i][j] = buffer;
            }
        }
        return hasil;
    }

    private static int[][] tambah(int[][] matrix1, int[][] matrix2){
        int baris_1 = matrix1.length;
        int kolom_1 = matrix1[0].length;

        int baris_2 = matrix2.length;
        int kolom_2 = matrix2[0].length;

        int[][] hasil = new int[baris_1][kolom_1];

        if (baris_1 == baris_2 && kolom_1 == kolom_2){
            for (int i = 0; i < baris_1; i++){
                for (int j = 0; j < kolom_1; j++){
                    hasil[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        } else {
            System.out.println("jumlah baris/kolom tidak sama");
        }

        return hasil;
    }

    private static void printArray(int[][] dataArray){
        int baris = dataArray.length;
        int kolom = dataArray[0].length;
        for (int i = 0; i < baris; i++){
            System.out.print("[");
            for (int j = 0; j < kolom; j++){
                System.out.print(dataArray[i][j]);

                if (j < (kolom -1)){
                    System.out.print(",");
                } else {
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
    }
}
