
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // System.out.println("Enter String : ");
        // String val = scn.next();
        // System.out.println("Length of " + val + " is " + val.length());

        // System.out.println("Enter String 1 : ");
        // String valOne = scn.next();
        
        // System.out.println("Enter String 2 : ");
        // String valTwo = scn.next();

        // System.out.println("Enter String 3 : ");
        // String valThree = scn.next();

        // System.out.println("Entered Strings are " + valOne + ", " + valTwo + ", "+ valThree);
        // System.out.println(valOne.equals(valTwo));
        // System.out.println(valTwo.equals(valThree));
        // System.out.println(valThree.equals(valOne));

        // .equalsIgnoreCase();
        // System.out.println(valOne.equalsIgnoreCase(valTwo));
        // System.out.println(valTwo.equalsIgnoreCase(valThree));
        // System.out.println(valThree.equalsIgnoreCase(valOne));

        // System.out.println("Enter the index :");
        // int indx = scn.nextInt();
        // char indxChr = valOne.charAt(indx); 
        // System.out.println("The " + indx + " index of " + valOne + " is " + indxChr);

        // toCharArray(); converts the string into character array 
        // String str = "Jayanth";
        // System.out.println("Given string " + str);
        // char [] ch = str.toCharArray();
        // for(int i=0;i<ch.length;i++){
        //     System.out.println(ch[i]);
        // }

        String strOne = "bAnaNa";
        String lcReslt = strOne.toLowerCase();
        System.out.println(lcReslt);
        String ucReslt = strOne.toUpperCase();
        System.out.println(ucReslt);
        String strTwo = " I am Jack";
        System.out.println(strTwo.trim());

        // StartsWith(string character);
        System.out.println(strOne.startsWith("b"));
        System.out.println(strOne.startsWith("A"));

        // endsWith(string character);
        System.out.println(strTwo.endsWith("k"));
        System.out.println(strOne.endsWith("N"));

        // Split();
        String colors = "red, blue, green, yellow, black";
        System.out.println(colors);

        String [] colorsArr = colors.split(",");
        for(int i=0;i<colorsArr.length;i++){
            System.out.println(colorsArr[i]);
        }
    }
}