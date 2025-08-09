package Latihan;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class W55_IO_ByteStream {

    public static void main(String[] args) throws IOException {

        // baca data
//        FileInputStream fileInputStream = new FileInputStream("input.txt");
//        System.out.println((char) fileInputStream.read());
//        System.out.println((char) fileInputStream.read());
//        System.out.println((char) fileInputStream.read());
//        System.out.println((char) fileInputStream.read());

        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;

        // Membuka file
        fileInput = new FileInputStream("input.txt");

        // Membaca file
        int data = fileInput.read();
        while (data != -1){ //-1 berarti kosong/tidak ada isinya
            System.out.println((char) data);
            data = fileInput.read();
        }

        // Menutup file
        fileInput.close();


        // Contoh scenario program pembukaan file
        try {
            fileInput = new FileInputStream("input2.txt");
            fileOutput = new FileOutputStream("output2.txt"); // jika gaada file nya, akan auto create

            // membaca file
            int buffer = fileInput.read();

            // menulis file
            fileOutput.write(buffer);

            while (buffer != -1){
                fileOutput.write(buffer);
                buffer = fileInput.read();
            }
        } finally {
            if (fileInput != null){
                fileInput.close();
            }
            if (fileOutput != null){
                fileOutput.close();
            }
        }

        // use try with resources
        try(FileInputStream in = new FileInputStream("input.txt")) {
            int data2 = in.read();
            while (data2 != -1){ //-1 berarti kosong/tidak ada isinya
                System.out.print((char) data2);
                data2 = in.read();
            }
        }

        try(FileInputStream in = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("outputNew.txt")) {
            int data2 = in.read();
            while (data2 != -1){ //-1 berarti kosong/tidak ada isinya
                out.write((char) data2);
                data2 = in.read();
            }
        }


    }
}
