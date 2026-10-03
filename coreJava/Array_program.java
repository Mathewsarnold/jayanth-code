public class Array_program {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);

        // System.out.println("Enter Array Size: ");
        // int size = scn.nextInt();

        // int [] arr = new int[size];
        // System.out.println("Enter "+ size+ " elements:");
        // for(int i =0; i<arr.length; i++){
        //     arr[i] = scn.nextInt();
        // }

        // System.out.println("Array elements in original order :");
        // for(int i=0; i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        // System.out.println("Array elements in reverse order :");
        // for(int i=arr.length-1; i>=0;i--){
        //     System.out.println(arr[i]);
        // }

        int [] numArr = {4,32,16,78,34,87,26,94,83,58};
        // for(int i =0; i<numArr.length; i++){
        //     if(numArr[i] % 2 == 0){
        //         System.out.println("Even numbers " + numArr[i]);
        //     } 
        // }
        // for(int i =0; i<numArr.length; i++){
        //     if(numArr[i] % 2 != 0){
        //         System.out.println("Odd numbers " + numArr[i]);
        //     } 
        // }
        // int evenSum = 0;
        // for(int i =0; i<numArr.length; i++){
        //     if(numArr[i] % 2 == 0){
        //         evenSum += numArr[i];
        //     }
        // }
        // System.out.println("Sum of even numbers " + evenSum);
        // int oddSum = 0;
        // for(int i =0; i<numArr.length; i++){
        //     if(numArr[i] % 2 != 0){
        //         oddSum += numArr[i];
        //     }
        // }
        // System.out.println("Sum of odd numbers " + oddSum);
        // int allElSum = 0;
        // for(int i =0; i<numArr.length; i++){
        //     allElSum += numArr[i];
        // }
        // System.out.println("Sum of all numbers " + allElSum);
        // int avrgVal = 0;
        // double val = 0.0;
        // for(int i =0; i<numArr.length; i++){
        //     avrgVal += numArr[i];
        // }
        // System.out.println("Sum of all numbers " + avrgVal);
        // val = (double) avrgVal / numArr.length; 
        // System.out.println("Average of all numbers: " + val);

        // String [] stringArr = {"Apple","Banana","Carrot","Dragonfruit","Fig"};
        // for(int i=stringArr.length-1; i>=0;i--){
        //     System.out.println(stringArr[i]);
        // }

        // char [] charArr = {'a','e','i','o','u'};
        // for(int i=0; i<charArr.length;i++){
        //     System.out.println(charArr[i]);
        // }

        // System.out.println("\nASCII values of given character aaray : ");
        // for(int i=0;i<charArr.length;i++){
        //     int asciiVals = charArr[i];
        //     System.out.println(asciiVals + ", ");
        // }

        int [] nums = {8,2,3,7,5,9};
        int evenSum = 0;
        int oddSum = 0;
        // for(int i =0;i<nums.length; i++){
        //     if(nums[i]%2==0){
        //         evenSum+=nums[i];
        //     } else {
        //         oddSum+=nums[i];
        //     }
        // }
        // System.out.println("Sum of even numbers " + evenSum);
        // System.out.println("Sum of odd numbers " + oddSum);
        // for(int i=0; i<nums.length;i++){
        //     System.out.println(i + "=" + nums[i]);
        //     if(i%2==0){
        //         evenSum+=nums[i];
        //     } else {
        //         oddSum+=nums[i];
        //     }
        // }
        // System.out.println("Sum of even index values " + evenSum);
        // System.out.println("Sum of odd index values " + oddSum);
        // int trgtVal = 3;
        // int indx = 0;
        // boolean isPrsnt = false;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==trgtVal) {
        //         isPrsnt = true;
        //         indx = i;
        //     }
        // }
        // if(isPrsnt){
        //     System.out.println("Value " + trgtVal +" is presented at index :" + indx);
        // } else {
        //     System.out.println("Value is not present");
        // }
        int lssVal = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i] < lssVal) {
                lssVal = nums[i];
            }
        }
        System.out.println(lssVal); 
    }
}