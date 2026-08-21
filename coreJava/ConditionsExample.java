public class ConditionsExample {
    public static void main (String [] args) {

        String g1 = "Male";
        if(g1 == "Male") {
            System.out.println("Person is male");
        } else {
            System.out.println("Person is female");
        }

        char ch = 'A';
        if(ch >= 0 && ch <= 9) {
            System.out.println(ch + " is a digit");
        } else {
            System.out.println(ch + " is a symbol");
        }

        int year = 2020;
        if(year%4==0){
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        int mark = 98;
        if(mark >= 35) {
            System.out.println(mark + " is a pass mark");
        } else {
            System.out.println(mark + " is a fail mark");
        }

        int ramAge = 24;
        int shyamAge = 21;
        if(ramAge < shyamAge) {
            System.out.println("Ram is younger than Shyam");
        } else {
            System.out.println("Shyam is younger than Ram");
        }

        int numbr = 5;
        if(numbr%2 == 0){
            System.out.println(numbr + numbr);
        } else {
            System.out.println(numbr * numbr);
        }

        int numbr1 = 3;
        if(numbr1 > 0){
            System.out.println(numbr1 + " is greater than 0");
        } else {
            System.out.println(numbr1 + " is 0");
        }

        int numbr2 = 7;
        if(numbr2%7==0 || numbr2%10==7){
            System.out.println(numbr2 + " is a buzz number");
        } else {
            System.out.println(numbr + " is not a buzz number   ");
        }

        int numbr3 = 3;
        if(numbr3 % 2 == 0){
            System.out.println("Even");
        } else if(numbr3 % 2 == 1){
            System.out.println("Odd");
        } else {
            System.out.println("Neutral");
        }

        int numbr4 = -1;
        if(numbr4>0){
            System.out.println("+ve");
        } else if(numbr4<0){
            System.out.println("-ve");
        } else {
            System.out.println("Zero");
        }

        int n1 = 22;
        int n2 = 43;
        int n3 = 55;

        if(n1> n2 && n1 > n3) {
            System.out.println(n1 + " is greater than " + n2 + "," + n3);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is greater than " + n1 + "," + n3);
        } else if (n3 > n1 && n3 > n2) {
            System.out.println(n3 + " is greater than " + n1 + "," + n2);

        }

        int ram = 25;
        int shyam = 22;
        int bham = 27;
        if(ram < shyam && ram < bham) {
            System.out.println("Ram is younger than Shyam and Bham");
        } else if (shyam < ram && shyam < bham) {
            System.out.println("Shyam is younger than Ram and Bham");
        } else if (bham < ram && bham < shyam) {
            System.out.println("Bham is younger than Ram and Shyam");
        }

        int numOne = 5;
        int numTwo = 9;
        int numThree = 11;
        int nnn = 270;

        if(nnn % numOne == 0) {
            System.out.println(nnn + " is divisible by " + numOne);
        } else if (nnn % numTwo == 0) {
            System.out.println(nnn + " is divisible by " + numTwo);
        } else if (nnn % numThree == 0) {
            System.out.println(nnn + " is divisible by " + numThree);
        }

        char chOne = 'f';
        if(chOne >= 0 && chOne<=9){
            System.out.println(chOne+" is a Digit");
        } else if (chOne >= 'A' && chOne <= 'z') {
            System.out.println(chOne+" is an Alphabet");
        } else {
            System.out.println(chOne+" is a Symbol");
        }

        int temp = 10;
        if(temp <= 0) {
            System.out.println("Freezing");
        } else if (temp > 0 && temp <= 10) {
            System.out.println("Too cold");
        } else if (temp > 10 && temp <= 20) {
            System.out.println("Cold");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("Normal");
        } else if (temp >= 30 && temp <= 35) {
            System.out.println("Hot");
        } else if (temp < 35) {
            System.out.println("Too Hot");
        }
    }
}