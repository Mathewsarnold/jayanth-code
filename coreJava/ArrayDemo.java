public class ArrayDemo {
    public static void main(String[] args) {
        int[] numArr = new int[5];
        numArr[0] = 11;
        numArr[1] = 22;
        numArr[2] = 33;
        numArr[3] = 44;

        System.out.println(numArr[0] + ", " + numArr[1] + ", " + numArr[2] + ", " + numArr[3] + ", " + numArr[4]);

        for(int i = 0; i<5; i++) {
            System.out.println(numArr[i]);
        }

        System.out.println("Length of the array is " + numArr.length);

        char [] vowels = {'a','e','i','o','u'};
        for(int i = 0; i<vowels.length; i++){
            System.out.println(vowels[i]);
        }
        System.out.println("Size is " + vowels.length);
    }
}