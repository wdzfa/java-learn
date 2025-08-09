package Latihan;

import javax.annotation.processing.Filer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class W59_ScannerAndStringTokenizer {

    public static void main(String[] args) throws IOException {

        FileReader fileInput = new FileReader("inputTokenizer.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);

        Scanner scanner = new Scanner(bufferedReader);

        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());

        System.out.println(scanner.hasNext()); // untuk cek apakah ada data lanjutan/tidak

        // Menggunakan delimiter tertentu
        FileReader fileInput2 = new FileReader("inputTokenizer2.txt");
        bufferedReader = new BufferedReader(fileInput2);
        bufferedReader.mark(200);

        scanner = new Scanner(bufferedReader);
        scanner.useDelimiter(",");

        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }

        // Menggunakan string tokenizer
        bufferedReader.reset();
        String data = bufferedReader.readLine(); // ngebaca 1 baris
        System.out.println(data);

        StringTokenizer stringTokenizer = new StringTokenizer(data,",");
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }

        // baris selanjutnya

        data = bufferedReader.readLine();
        System.out.println(data); // print 1 baris data

        stringTokenizer = new StringTokenizer(data, ",");

        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }

    }
}
