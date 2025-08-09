package Latihan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class W60_CRUD1 {

    public static void main(String[] args) throws IOException {

        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean isLanjutkan = true;

        while (isLanjutkan) {
            clearScreen();
            System.out.println("Database Perpustakaan");
            System.out.println("1.\tLihat seluruh buku");
            System.out.println("2.\tCari data buku");
            System.out.println("3.\tTambah data buku");
            System.out.println("4.\tUbah data buku");
            System.out.println("5.\tHapus data buku");

            System.out.print("\n\nPilihan anda: ");
            pilihanUser = terminalInput.next();

            switch (pilihanUser) {
                case "1":
                    System.out.println("\n=================");
                    System.out.println("LIST SELURUH BUKU");
                    System.out.println("=================");
                    // Tampilkan data
                    tampilkanData();
                    break;
                case "2":
                    System.out.println("\n==========");
                    System.out.println("CARI BUKU");
                    System.out.println("==========");
                    // cari data
                    searchData();
                    break;
                case "3":
                    System.out.println("\n=================");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("=================");
                    // tambah data
                    break;
                case "4":
                    System.out.println("\n===============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("===============");
                    // ubah data
                    break;
                case "5":
                    System.out.println("\n===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===============");
                    // hapus data
                    break;
                default:
                    System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih (1-5)\n");
            }

            isLanjutkan = getYesOrNo("Apakah anda ingin melanjutkan");

        }

    }

    private static void tampilkanData() throws IOException{

        FileReader fileInput;
        BufferedReader bufferedReader;
        try{
            fileInput = new FileReader("database.txt");
            bufferedReader = new BufferedReader(fileInput);
        } catch (Exception e){
            System.err.println("Database Tidak Ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            return;
        }

        System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit                 |\tJudul Buku");
        System.out.println("--------------------------------------------------------------------------------------");

        String data = bufferedReader.readLine();
        int nomor = 1;
        while (data != null) {
            view(data,nomor++);

            data = bufferedReader.readLine();

        }
        System.out.println("--------------------------------------------------------------------------------------");

    }

    private static void searchData() throws IOException{

        try{
            File file = new File("database.txt");
        } catch (Exception e){
            System.err.println("Database Tidak Ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            return;
        }

        // ambil keyword dari user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata kunci untuk mencari buku: ");
        String dataInput = scanner.nextLine();
//        System.out.println(dataInput);

        String[] keywords = dataInput.split("\\s+");

        checkBuku(keywords);
    }

    private static void checkBuku(String[] keywords) throws IOException{
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);

        String data = bufferedReader.readLine();
        boolean isExist;
        int nomor = 1;

        System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit                 |\tJudul Buku");
        System.out.println("--------------------------------------------------------------------------------------");

        while (data != null){

            isExist = true;
//            System.out.println(data);
//            System.out.println(Arrays.toString(keywords));
            // gunakan for each agar tidak perlu memikirkan panjang akhir dari data
            for(String key: keywords){
                isExist = isExist && data.toLowerCase().contains(key.toLowerCase());
                // di cek, kalau 2 2 nya true maka bernilai true dan berarti exist
            }
//            System.out.println(isExist);

            if (isExist){
                view(data,nomor++);
            }

            data = bufferedReader.readLine();
        }
    }


    private static boolean getYesOrNo(String message){
        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        System.out.print("\n" + message + " (y/n)? ");
        pilihanUser = terminalInput.next();

        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")){
            System.err.println("Pilihan anda bukan y atau n");
            System.out.print("\n" + message + " (y/n)? ");
            pilihanUser = terminalInput.next();
        }

        return pilihanUser.equalsIgnoreCase("y");

    }

    private static void clearScreen() throws IOException{
        try{
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }
        } catch (Exception e){
            System.err.println("Can't clear screen");
        }
    }

    private static void view(String data, int nomor) throws IOException{

        StringTokenizer tokenizer = new StringTokenizer(data, ",");

        tokenizer.nextToken(); // gaperlu di print
        System.out.printf("| %2d ", nomor);
        System.out.printf("|\t%4s  ", tokenizer.nextToken());
        System.out.printf("|\t%-20s   ", tokenizer.nextToken());
        System.out.printf("|\t%-20s     ", tokenizer.nextToken());
        System.out.printf("|\t%s   ", tokenizer.nextToken());
        System.out.print("\n");

    }
}
