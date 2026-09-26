import java.util.Scanner;
public class Array_program {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Array Size: ");
        int size = scn.nextInt();

        int [] arr = new int[size];
        System.out.println("Enter "+ size+ " elements:");
        for(int i =0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        // System.out.println("Array elements in original order :");
        // for(int i=0; i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        System.out.println("Array elements in reverse order :");
        for(int i=arr.length-1; i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}