package Latihan;

public class W16_BitwiseOperation {

    public static void main(String[] args){

        // Operator bitwise = operator untuk melakukan operasi pada nilai bit
        byte a = 3;
        byte b,c;
        String a_bits, b_bits, c_bits;

        // Operator SHIFT LEFT
        System.out.println("====== SHIFT LEFT(<<)");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits,a);

        b = (byte)(a << 1); // geser 1 step ke kiri
        // jadi yang awalnya nilai a = 3 dengan byte = 00000011 menjadi 00000110
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits,b);

        // Operator SHIFT RIGHT
        System.out.println("====== SHIFT RIGHT (>>)");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = (byte)(a >> 1); // geser 1 step ke KANAN
        // jadi yang awalnya nilai a = 24 dengan byte = 00011000 menjadi 00001100 dengan hasil 12
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits,b);


        // Operator bitwise OR
        // 00000110    0 0 0 0 0 1 1 0
        // 00001100 =  0 0 0 0 1 1 0 0
        // 00001110    0 0 0 0 1 1 1 0
        System.out.println("====== BITWISE OR (|)");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits,b);

        System.out.println("-----------------------------OR");
        c = (byte) ( a | b );
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits,c);

        // Operator bitwise AND
        System.out.println("====== BITWISE AND (&)");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits,b);

        System.out.println("-----------------------------AND");
        c = (byte) ( a & b );
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits,c);

        // Operator bitwise XOR
        System.out.println("====== BITWISE XOR (^)");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits,b);

        System.out.println("-----------------------------XOR");
        c = (byte) ( a ^ b );
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits,c);

        // Operator Negasi / Not / lawan dari nilai ( 0 lawan nya 1, 1 lawan nya 0)
        System.out.println("====== BITWISE NOT (~)");
        a = 24;
        b = (byte) ~a;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits,a);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).substring(24);
        System.out.printf("%s = %d \n", b_bits,b);
    }
}
