package Latihan;

import java.io.*;

public class W57_BufferedByteStream {

    public static void main(String[] args) throws IOException {

        long waktuStart, waktuFinish;

        // Membaca dari file
        FileInputStream byteInput = new FileInputStream("input.txt");
        System.out.println(byteInput.available());

        // Menghitung waktu pembacaan
        waktuStart = System.nanoTime();
        System.out.println(byteInput.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("waktu = " + (waktuFinish - waktuStart));
        byteInput.close();

        // Membaca dari memory agar lebih cepat
        FileInputStream byteInput2 = new FileInputStream("input.txt");
        BufferedInputStream bufferedInput = new BufferedInputStream(byteInput2);

        bufferedInput.mark(200);
        waktuStart = System.nanoTime();
        System.out.println(bufferedInput.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("waktu = " + (waktuFinish - waktuStart));

                // baca ulang
        bufferedInput.reset();
        byte[] data = bufferedInput.readAllBytes();
        String dataString = new String(data);
        System.out.println(dataString);
        bufferedInput.close();
        byteInput.close();

        FileOutputStream byteOutput = new FileOutputStream("outputBuffer.txt");
        BufferedOutputStream bufferedOutput = new BufferedOutputStream(byteOutput);

        //write data berupa byte
        bufferedOutput.write(data,0,data.length);
        bufferedOutput.flush();

        bufferedOutput.close();
        byteOutput.close();
    }

}
