package Latihan;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class W56_IO_CharStream {

    // UNBUFFERED I/O (TIDAK DIMASUKKAN MEMORI)
    public static void main(String[] args) throws Exception{

        // Membuka file
        // byte stream -> FileInputStream
        // char stream -> FileReader

        //input
        FileInputStream byteFileInput = new FileInputStream("input.txt");
        FileReader charFileInput = new FileReader("input.txt");
        //output
        FileOutputStream byteFileOutput = new FileOutputStream("outputByte.txt");
        FileWriter charFileOutput = new FileWriter("outputChar.txt");

        // Membaca file
        int buffer = byteFileInput.read();
        while (buffer != -1){
            System.out.print((char) buffer); // ini akan mencetak karakter aneh
            byteFileOutput.write(buffer); // namun hasil output di file nya akan sesuai
            buffer = byteFileInput.read();
        }

        buffer = charFileInput.read();
        while (buffer != -1){
            System.out.print((char) buffer); // ini tidak akan mencetak karakter aneh (mencetak sesuai)
            charFileOutput.write(buffer); // namun hasil output di file nya akan sesuai
            buffer = charFileInput.read();
        }

        byteFileInput.close();
        charFileInput.close();
        byteFileOutput.close();
        charFileOutput.close();

//        kesimpulan : lebih baik pakai char stream kalau membaca file yg international text
    }
}
