public class Programs {
    public static void main (String [] args) {

        int num1 = 7492;
        int count1 = 0;

        do {
            count1++;
            num1 = num1 / 10; 
        } while (num1 > 0);

        System.out.println(count1);
    
        int num2 = 2022;
        int sum = 0;

        do {
            sum += num2 % 10;  
            num2 /= 10;
        } while (num2 > 0);
        System.out.println(sum);
    

        long num3 = 219102439;
        long evenSum = 0;
        long oddSum = 0;

        do {
            long digit = num3 % 10;

            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }

            num3 = num3 / 10;
        } while (num3 > 0);
        System.out.println(evenSum);
        System.out.println(oddSum);

        int num4 = 657464689;
        int temp = num4;
        
        int lastDigit = num4 % 10;
        int firstDigit = 0;

        do {
            firstDigit = temp % 10;
            temp /= 10;
        } while (temp > 0);

        System.out.println(firstDigit + " First digit");
        System.out.println(lastDigit + " Last digit");
    }
}