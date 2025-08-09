package Latihan;

import java.util.Formatter;

public class W51_StringFormat {

    public static void main(String[] args) {

        String nama = "Udin";
        int umur = 17;

        System.out.println("Nama saya adalah " + nama + ", umur saya adalah " + umur);

        // cara lain
        System.out.printf("Nama saya adalah %s, umur saya adalah %d\n", nama,umur);
        /* conversion :
            f = floating point
            d = integer
            c = character
            s = string
            b = boolean
            struktur format : %[argument_index][flags][width][.precision]conversion
        */
        //  [argument_index]
        System.out.println("\nArgument input");
        // udin wahai udin kemana saja kamu
        System.out.printf("%1$s wahai %1$s kemana saja kamu\n", nama);
        // umur udin berapa? udin menjawab: 17, wah masih muda ya umurnya 17
        System.out.printf("\numur %1$s berapa?\n%1$s menjawab: %2$d\nwah masih muda ya umurnya %2$d\n", nama, umur);

        // [flags]
        System.out.println("\nFlags");
        int int1 = 5;
        int int2 = 8;
        int hasil = int1 - int2;
        System.out.printf("%d - %d = %+d\n", int1,int2,hasil);

        // [width]
        System.out.println("\nwidth");
        int int3 = 1000;
        System.out.println("INTEGER");
        System.out.printf("%d\n", int3);
        System.out.printf("%5d\n", int3);   // cetak sepanjang 5 input ke kanan (rata kanan)
        System.out.printf("%-5d\n", int3);    // flags "-" artinya rata kiri
        System.out.printf("%+5d\n", int3);    // akan mengambil slot di dalam format dengan + paling depan
        System.out.printf("%+-6d\n", int3);    // flags bisa digabungkan
        System.out.printf("%10d\n", int3);
        System.out.printf("% 10d\n", int3);
        System.out.printf("%010d\n", int3); // flags 0, kita tambahkan leading "0" di depan
        System.out.printf("%+010d\n", int3);
        System.out.printf("%,10d\n", int3);     // nambahin koma untuk nominal
        int int4 = 1000000000;
        System.out.printf("%-,15d\n", int4); // tambah koma untuk nominal

        System.out.println("\nFLOSTING POINT");
        float float1 = 1.543f;
        System.out.printf("%f\n", float1); // akan mengambil width dengan 6decimal
        System.out.printf("%+9f\n", float1);

        // [precision]
        System.out.println("\nPercision");
        float float2 = 1.543f;
        System.out.printf("%f\n", float2);
        System.out.printf("%.1f\n", float2); // ambil 1 angka setelah koma (berlaku pembulatan)
        System.out.printf("%.2f\n", float2); // ambil 2 angka belakang koma
        System.out.printf("%8.2f\n", float2); //gabung dengan width
        System.out.printf("%+08f\n", float2); // gabung dengan width dan flag

        // contoh
        String nama2 = "Ucup";
        float IPK = 3.7535346f;

        // struktur format : %[argument_index][flags][width][.precision]conversion
        // tampilkan ipk dengan input sepanjang 5 diawali + dan tampilkan hanya 2 angka belakang koma
        System.out.printf("\nIPK %1$s berapa?\n%1$s: saya dapat %2$+5.2f\n", nama2, IPK);

        // Conclusion
        // save format ini kedalam variabel string
        String info_biasa = "nama: " + nama2 + ", IPK = " + IPK;
        System.out.println("String biasa: " + info_biasa);

        String info_format = String.format("nama: %s, IPK = %2$+5.2f", nama2,IPK);
        System.out.println("String format: " + info_format);

        // save format to string builder
        StringBuilder builder_info = new StringBuilder();
        Formatter formatBuilder = new Formatter(builder_info);

        formatBuilder.format("nama: %s, IPK = %2$+5.2f", nama2,IPK);
        System.out.println("String builder: " + builder_info);
    }
}
