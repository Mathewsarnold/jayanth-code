
import java.util.Scanner;

public class StringTasks {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter string : ");
        String strOne = scn.next();
        // for(int i=strOne.length()-1;i>=0;i--){
        //     System.out.println(strOne.charAt(i));
        // }

        // String strTwo = "Rhinosorous";
        // int strTwoCnt = 0;
        // for(int i = 0;i<strTwo.length();i++){
        //     strTwoCnt++;
        // }
        // System.out.println(strTwoCnt);

        // Palindrome check
        String temp = "";
        // for(int i=strOne.length()-1;i>=0;i--){
        //     temp = temp + strOne.charAt(i);
        // }
        // System.out.println(strOne + " " + temp);

        // if(strOne.equalsIgnoreCase(temp)){
        //     System.out.println("It is a palindrome");
        // } else {
        //     System.out.println("Not a palindrome");
        // }

        // Print vowels in the given string
        // int vowelsCnt = 0;
        // int consCnt = 0;
        // strOne = strOne.toLowerCase();
        // for(int i=0; i<strOne.length(); i++) {
        //     char tempChar = strOne.charAt(i);
        //     if(tempChar == 'a' || tempChar == 'e' || tempChar == 'i' || tempChar == 'o' || tempChar == 'u') {
        //             vowelsCnt++;
        //         }
        // }
        // System.out.println(vowelsCnt);
        // System.out.println("=================================================================");
        // for(int i=0; i<strOne.length(); i++) {
        //     char tempChar = strOne.charAt(i);
        //     if(tempChar != 'a' || tempChar != 'e' || tempChar != 'i' || tempChar != 'o' || tempChar != 'u') {
        //             consCnt++;
        //         }
        // }
        // System.out.println(consCnt);

        // Count uppercase and lowercase letter in a string
        int upcCnt = 0;
        int lwcCnt = 0;
        for(int i=0; i<strOne.length();i++){
            if(strOne.charAt(i) >= 'A' && strOne.charAt(i) <= 'Z') {
                upcCnt++;
            }
            if(strOne.charAt(i) >= 'a' && strOne.charAt(i) <= 'z') {
                lwcCnt++;
            }
        }
        System.out.println(upcCnt);
        System.out.println(lwcCnt);
    }
}