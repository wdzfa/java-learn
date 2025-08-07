package teory;

public class StringBuilderOperation {

    public static void main(String[] args) {

        /* tujuan agar penggunaan memori lebih sedikit, karna memori akan tetap sama
         saat menggunakan stringbuilder beda dengan string
        */

        StringBuilder builder = new StringBuilder("halo");
        printData(builder);

        // append
        builder.append(" semuanya");
        printData(builder);

        builder.append(" warga Surabaya");
        printData(builder);

        // insert
        builder.insert(19," Kota"); //insert mulai index 19
        printData(builder);

        // delete
        builder.delete(19,24);
        printData(builder);

        // change character for specific index
        builder.setCharAt(14, 'W');
        printData(builder);

        // replace
        builder.replace(20,28,"Bandung");
        printData(builder);

        // casting to string
        String kalimat = builder.toString();
        int addressString = System.identityHashCode(kalimat);
        System.out.println("address = " + Integer.toHexString(addressString));
    }

    private static void printData(StringBuilder dataBuilder){

        System.out.println("data = " + dataBuilder);
        System.out.println("panjang = " + dataBuilder.length());
        System.out.println("kapasitas = " + dataBuilder.capacity());

        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("address = " + Integer.toHexString(addressBuilder));

    }
}
