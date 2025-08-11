package Latihan;

import javax.annotation.processing.Filer;
import java.io.*;
import java.nio.file.FileSystemException;
import java.time.Year;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class W60_CRUD {

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
                    tambahData();
                    break;
                case "4":
                    System.out.println("\n===============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("===============");
                    // ubah data
                    updateData();
                    break;
                case "5":
                    System.out.println("\n===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===============");
                    // hapus data
                    deletedata();
                    break;
                default:
                    System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih (1-5)\n");
            }

            isLanjutkan = getYesOrNo("Apakah anda ingin melanjutkan");

        }

    }

    private static void updateData() throws IOException{

        // ambil database original
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferInput = new BufferedReader(fileInput);

        // buat database sementara
        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        // tampilkan data
        System.out.println("List Buku");
        tampilkanData();

        // ambil user input / pilihan data
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\nMasukkan nomor buku yang akan di update: ");
        int updateNum = terminalInput.nextInt();

        // tampilkan data yang ingin di update
        String data = bufferInput.readLine();
        int entryCount = 0;

        while (data != null){
            entryCount++;
            StringTokenizer st = new StringTokenizer(data,","); // baca per jeda koma

            // tampilkan kalo entryCount == updateNum
            if (updateNum == entryCount){
                System.out.println("\nData yang ingin anda update adalah:");
                System.out.println("------------------------------------");
                System.out.println("Referensi     : " + st.nextToken());
                System.out.println("Tahun         : " + st.nextToken());
                System.out.println("Penulis       : " + st.nextToken());
                System.out.println("Penerbit      : " + st.nextToken());
                System.out.println("Judul         : " + st.nextToken());

                // ambil input yang di ubah
                String[] fieldData = {"tahun","penulis","penerbit","judul"};
                String[] tempData = new String[4];

                st = new StringTokenizer(data,",");
                String originalData = st.nextToken();

                for (int i = 0; i< fieldData.length; i++){
                    boolean isUpdate = getYesOrNo("Apakah anda ingin mengubah " + fieldData[i]);
                    originalData = st.nextToken();
                    if (isUpdate){
                        // user input

                        if (fieldData[i].equalsIgnoreCase("tahun")){
                            System.out.print("masukkan tahun terbit. format=(YYYY): ");
                            tempData[i] = ambilTahun();
                        } else {
                            terminalInput = new Scanner(System.in);
                            System.out.print("\nMasukkan " + fieldData[i] + " baru: ");
                            tempData[i] = terminalInput.nextLine(); // data yang mau diubah dimasukkan kesini
                        }

                    } else {
                        // kalo ga di update berarti copy aja ke file baru
                        tempData[i] = originalData;
                    }
                }

//                System.out.println(Arrays.toString(tempData));

                // tampilkan data baru ke layar
                st = new StringTokenizer(data,",");
                st.nextToken();

                System.out.println("\nData baru anda adalah:");
                System.out.println("------------------------------------");
                System.out.println("Tahun         : " + st.nextToken() + " --> " + tempData[0]);
                System.out.println("Penulis       : " + st.nextToken() + " --> " + tempData[1]);
                System.out.println("Penerbit      : " + st.nextToken() + " --> " + tempData[2]);
                System.out.println("Judul         : " + st.nextToken() + " --> " + tempData[3]);

                boolean isUpdate = getYesOrNo(("apakah anda yakin ingin mengubah data tersebut?"));
                if (isUpdate){

                    // cek data baru di database pakai method cekbuku
                    boolean isExist = checkBuku(tempData,false);
                    if (isExist){
                        System.out.println("data buku sudah ada di database, proses update dibatalkan\nSilahkan delete data yang bersangkutan");
                        bufferOutput.write(data);
                    } else {
                        // format data baru ke database
                        String tahun = tempData[0];
                        String penulis = tempData[1];
                        String penerbit = tempData[2];
                        String judul = tempData[3];

                        // bikin primarykey
                        long nomorEntry = ambilEntryPerTahun(penulis,tahun);

                        String penulisTanpaSpasi = penulis.replaceAll("\\s","");
                        String primaryKey = penulisTanpaSpasi+"_"+tahun+"_"+nomorEntry;

                        // tulis data ke db
                        bufferOutput.write(primaryKey + "," + tahun + "," + penulis + "," + penerbit + "," + judul);

                    }
                } else {
                    // copy data
                    bufferOutput.write(data);
                }

            } else {
                // copy data
                bufferOutput.write(data);
            }
            bufferOutput.newLine();
            data = bufferInput.readLine();
        }

        bufferOutput.flush();

        bufferInput.close();
        bufferOutput.close();
        fileInput.close();
        fileOutput.close();
        System.gc();

        // delete database original
        database.delete();
        // rename file sementara ke database
        tempDB.renameTo(database);

    }

    private static void deletedata() throws IOException{
        // ambil database original
        File dataOri = new File("database.txt");
        FileReader fileInput = new FileReader(dataOri);
        BufferedReader bufferInput = new BufferedReader(fileInput);

        // buat database sementara
        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        // tampilkan data
        System.out.println("List Buku");
        tampilkanData();

        // ambil user input untuk delete data
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\nMasukkan nomor buku yang akan di hapus: ");
        int deleteNum = terminalInput.nextInt();

        // looping untuk membaca tiap data baris dan skip data yang akan di delete
        boolean isFound = false;
        int entryCounts = 0;
        String data = bufferInput.readLine();

        while (data != null){
            entryCounts++;
            boolean isDelete = false;
            StringTokenizer st = new StringTokenizer(data,",");

            // tampilkan data yang ingin di hapus
            if (deleteNum == entryCounts){
                System.out.println("\nData yang ingin anda hapus adalah:");
                System.out.println("------------------------------------");
                System.out.println("Referensi     : " + st.nextToken());
                System.out.println("Tahun         : " + st.nextToken());
                System.out.println("Penulis       : " + st.nextToken());
                System.out.println("Penerbit      : " + st.nextToken());
                System.out.println("Judul         : " + st.nextToken());

                isDelete = getYesOrNo("Apakah anda yakin akan menghapus?");
                isFound = true;
            }

            if (isDelete){
                // tidak perlu memindahkan ke database sementara
                System.out.println("Data berhasil dihapus");
            } else {
                // pindahkan data dari original ke database sementara
                bufferOutput.write(data);
                bufferOutput.newLine();
            }
            data = bufferInput.readLine(); // jangan lupa di refresh biar ga data pertama doang yg kebaca
        }
        if (!isFound){
            System.out.println("Buku tidak ditemukan");
        }

        // menulis data ke file
        bufferOutput.flush();

        bufferInput.close();
        bufferOutput.close();
        fileInput.close();
        fileOutput.close();
        System.gc();

        // delete database original
        dataOri.delete();
        // rename file sementara ke database
        tempDB.renameTo(dataOri);

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
            tambahData();
            return;
        }

        viewTitle(true);
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
            tambahData();
            return;
        }

        // ambil keyword dari user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata kunci untuk mencari buku: ");
        String dataInput = scanner.nextLine();
//        System.out.println(dataInput);

        String[] keywords = dataInput.split("\\s+");

        checkBuku(keywords, true);
    }

    private static void tambahData() throws IOException{

        FileWriter fileOutput = new FileWriter("database.txt",true);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        Scanner terminalInput = new Scanner(System.in);
        String penulis, judul, penerbit, tahun;

        System.out.print("Masukkan nama penulis: ");
        penulis = terminalInput.nextLine();
        System.out.print("Masukkan judul buku: ");
        judul = terminalInput.nextLine();
        System.out.print("Masukkan nama penerbit: ");
        penerbit = terminalInput.nextLine();
        System.out.print("Masukkan tahun terbit, format=(YYYY):  ");
        tahun = ambilTahun();

        String[] keywords = {tahun+","+penulis+","+penerbit+","+judul};
        System.out.println(Arrays.toString(keywords));

        boolean isExist = checkBuku(keywords,false);

        // menulis ke database
        if (!isExist){
            System.out.println(ambilEntryPerTahun(penulis,tahun));
            long nomorEntry = ambilEntryPerTahun(penulis,tahun);

            String penulisTanpaSpasi = penulis.replaceAll("\\s","");
            String primaryKey = penulisTanpaSpasi+"_"+tahun+"_"+nomorEntry;
            System.out.println("\nData yang akan anda masukkan adalah");
            System.out.println("--------------------------------------");
            System.out.println("primary key  : " + primaryKey);
            System.out.println("tahun terbit : " + tahun);
            System.out.println("penulis      : " + penulis);
            System.out.println("judul        : " + judul);
            System.out.println("penerbit     : " + penerbit);

            boolean isTambah = getYesOrNo("Apakah anda ingin menambah data tersebut?");

            if (isTambah){

                bufferOutput.write(primaryKey + "," + tahun + "," + penulis + "," + penerbit + "," + judul);
                bufferOutput.newLine();
                bufferOutput.flush();
            }
        }
        else {
            System.out.println("Buku yang anda masukkan sudah tersedia di database");
            checkBuku(keywords,true);
        }

        bufferOutput.close();

    }

    private static long ambilEntryPerTahun(String penulis, String tahun) throws IOException{

        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        long entry = 0;
        String data = bufferInput.readLine();
        Scanner dataScanner;
        String primaryKey;

        while (data != null){
            dataScanner = new Scanner(data);
            dataScanner.useDelimiter(",");
            primaryKey = dataScanner.next(); //ini ngambil primary key line pertama
            dataScanner = new Scanner(primaryKey); // ini mau baca lagi isi primary key nya, karna mau dipotong lagi

            penulis = penulis.replaceAll("\\s", "");
            if (penulis.equalsIgnoreCase(dataScanner.next()) && tahun.equalsIgnoreCase(dataScanner.next())){
                entry = dataScanner.nextInt();
            }
            data = bufferInput.readLine();

        }
        return entry;
    }

    private static String ambilTahun() throws IOException{
        boolean tahunValid = false;
        Scanner terminalInput = new Scanner(System.in);
        String tahun = terminalInput.nextLine();
        while (!tahunValid){
            try {
                Year.parse(tahun);
                tahunValid = true;
            } catch (Exception e){
                System.out.println("Format tahun yang anda masukan salah, format=(YYYY)");
                System.out.print("silahkan masukan tahun terbit lagi: ");
                tahunValid = false;
                tahun = terminalInput.nextLine();
            }
        }
        return tahun;
    }

    private static boolean checkBuku(String[] keywords, boolean isDisplay) throws IOException{
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);

        String data = bufferedReader.readLine();
        boolean isExist = false;
        int nomor = 1;

        if (isDisplay) {
            viewTitle(true);
        }
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

            if (isExist) {
                if (isDisplay) {
                    view(data, nomor++);
                }
                else {
                    break;
                }
            }

            data = bufferedReader.readLine();
        }

        if (isDisplay){
            System.out.println("--------------------------------------------------------------------------------------");
        }

        return isExist;
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

    private static void viewTitle(boolean isDisplay) {
        System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit                 |\tJudul Buku");
        System.out.println("--------------------------------------------------------------------------------------");

    }
}
