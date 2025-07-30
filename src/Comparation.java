public class Comparation {

    public static void main(String[] args){

        int a,b;
        boolean compare;

        // Persamaan
        a  = 10;
        b = 10;
        compare = (a == b);
        System.out.printf("%d dan %d --> %s\n", a,b, compare);

        // Pertidaksamaan
        a  = 12;
        b = 10;
        compare = (a == b);
        System.out.printf("%d dan %d --> %s\n", a,b,compare);

        // Operator less than (kurang dari)
        a  = 9;
        b = 10;
        compare = (a < b);
        System.out.printf("%d less than %d --> %s\n", a,b,compare);

        // Operator greater than (lebih dari)
        a  = 10;
        b = 10;
        compare = (a > b);
        System.out.printf("%d greater than %d --> %s\n", a,b,compare);

        // Operator less than equal (kurang dari sama dengan)
        a  = 10;
        b = 10;
        compare = (a <= b);
        System.out.printf("%d less than equal %d --> %s\n", a,b,compare);

        // Operator greater than equal (lebih dari sama dengan)
        a  = 10;
        b = 10;
        compare = (a >= b);
        System.out.printf("%d greater than %d --> %s\n", a,b,compare);
    }
}
