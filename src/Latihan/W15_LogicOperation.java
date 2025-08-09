package Latihan;

public class W15_LogicOperation {

    public static void main(String[] args){

        // Operator logika -> OR, AND, XOR, negasi

        boolean a,b,c;

        //OR
        System.out.println("==== OR(||) ====");
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);

        //OR
        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);

        //OR
        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);

        //AND
        System.out.println("==== AND(&&) ====");
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);

        //AND
        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && "  + b + " = " + c);

        //AND
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);


        // XOR
        System.out.println("==== XOR(^) ====");
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        //AND
        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ "  + b + " = " + c);

        //AND
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        // NOT / Negasi -> flipping
        System.out.println("==== NEGASI(^) ====");
        a = true;
        c = !a;
        System.out.println(a + " --> (!) = " + c);

        a = false;
        c = !a;
        System.out.println(a + " --> (!) = " + c);

    }
}
