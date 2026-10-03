
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // System.out.println("Enter String : ");
        // String val = scn.next();
        // System.out.println("Length of " + val + " is " + val.length());

        System.out.println("Enter String 1 : ");
        String valOne = scn.next();
        
        System.out.println("Enter String 2 : ");
        String valTwo = scn.next();

        System.out.println("Enter String 3 : ");
        String valThree = scn.next();

        System.out.println("Entered Strings are " + valOne + ", " + valTwo + ", "+ valThree);
        // System.out.println(valOne.equals(valTwo));
        // System.out.println(valTwo.equals(valThree));
        // System.out.println(valThree.equals(valOne));

        // .equalsIgnoreCase();
        System.out.println(valOne.equalsIgnoreCase(valTwo));
        System.out.println(valTwo.equalsIgnoreCase(valThree));
        System.out.println(valThree.equalsIgnoreCase(valOne));
        
    }
}