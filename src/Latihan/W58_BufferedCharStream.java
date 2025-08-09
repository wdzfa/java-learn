package Latihan;

import java.io.*;
import java.util.Arrays;

public class W58_BufferedCharStream {

    public static void main(String[] args) throws IOException {


        FileReader charInput = new FileReader("inputChar.txt");
        BufferedReader bufferedReader = new BufferedReader(charInput);

        bufferedReader.mark(200);

        // membaca ke dalam string
        String data = bufferedReader.readLine();
        System.out.println(data);
        System.out.println(bufferedReader.read()); // baca address
        System.out.println((char) bufferedReader.read()); // baca char

        // membaca ke dalam char
        bufferedReader.reset();
        char[] dataChar = new char [25];
        bufferedReader.read(dataChar,0,25);
        System.out.println(Arrays.toString(dataChar));

        // membaca baris
        bufferedReader.reset();
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());

        // menulis file
        FileWriter fileOutput = new FileWriter("outputChar.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileOutput);

        bufferedReader.reset();
        String baris1 = bufferedReader.readLine();

        bufferedWriter.write(baris1,0,baris1.length());
        bufferedWriter.flush();  // harus di flush biar kesimpen di file output txt nya

        // menambah new line, enter
        bufferedWriter.newLine();

        String baris2 = bufferedReader.readLine();
        bufferedWriter.write(baris2, 0, baris2.length());
        bufferedWriter.flush();

        bufferedWriter.close();
        bufferedReader.close();
        fileOutput.close();
        charInput.close();

    }
}
