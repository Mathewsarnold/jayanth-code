
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter byte: ");
        byte b1 = scn.nextByte();
        System.out.println("Enter short: ");
        short s1 = scn.nextShort();
        System.out.println("Enter int: ");
        int i1 = scn.nextInt();
        System.out.println("Enter long: ");
        long l1 = scn.nextLong();
        System.out.println("Enter double: ");
        double d1 = scn.nextDouble();
        System.out.println("Enter Float: ");
        float f1 = scn.nextFloat();
        System.out.println("Enter Char: ");
        char c1 = scn.next().charAt(0);
        System.out.println("Enter Boolean: ");
        boolean b = scn.nextBoolean();

        System.out.println("Byte : "+b1);
        System.out.println("Short : "+s1);
        System.out.println("Int : "+i1);
        System.out.println("long : "+l1);
        System.out.println("double : "+d1);
        System.out.println("float : "+f1);
        System.out.println("char : "+c1);
        System.out.println("booelan : "+b);

    }
}