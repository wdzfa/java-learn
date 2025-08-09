package Latihan;

public class W33_NestedLoops {
    public static void main(String[] args){

        for (int i = 0; i < 5; i++){
            for (int j = 0; j<5; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = 0; i < 5; i++){ // Iterasi ke bawah
            for (int j = 0; j<5; j++){ // iterasi ke samping
                System.out.print("* ");
                if (i == j){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = 0; i < 5; i++){ // Iterasi ke bawah
            for (int j = 0; j<5; j++){ // iterasi ke samping
                if (j < 4 - i){
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");

                }

            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = 0; i < 5; i++){ // Iterasi ke bawah
            for (int j = 0; j<5; j++){ // iterasi ke samping
                System.out.print("* ");
                if (j + i == 4){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = 0; i < 9; i++){ // Iterasi ke bawah
            for (int j = 0; j<9; j++){ // iterasi ke samping
                System.out.print("* ");
                if (i == j){
                    break;
                } else if (i + j == 8) {
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");


    }
}
