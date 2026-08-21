public class LogicalOperators {
    public static void main (String [] args) {
        int num1 = 3;
        int num2 = 4;
        int num3 = 2;

        boolean res1 = (num1 < num2) && (num2 < num3);
        boolean res2 = (num1 > num2) && (num2 > num3) && (num3 > num1);
        boolean res3 = (num1!= num2) || (num2 != num3);
        boolean res4 = (num1 >= num2) ^ (num2 <= num3);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);

    }
}