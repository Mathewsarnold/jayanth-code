public class PlusOperator {
    public static void main (String [] args) {
        int n1 = 23;
        int n2 = 12;
        System.out.println(n1 + n2);

        double d1 = 20.3;
        double d2 = 5.2;
        System.out.println(d1 + d2);

        char c1 = 'B';
        char c2 = 'A';
        System.out.println(c1 + c2);

        int n3 = 33;
        double d3 = 12.2;
        char c3 = 'j';
        System.out.println(n3 + d3 + c3);

        String s1 = "Jack";
        String s2 = "boy";
        System.out.println(s1 + s2);

        String s3 = "Hello";
        int n4 = 78;
        double d4 = 11.1;
        System.out.println(d4 + n4 + s3);
        System.out.println(s3 + n4 + d4);

        char c4 = 'A';
        char c5 = 'J';
        System.out.println(c4 + n4 + c5 - d4 + s3 + (s1+s2));

        System.out.println("Jayanth");
    }
}