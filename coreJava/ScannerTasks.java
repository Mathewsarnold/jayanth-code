import java.util.Scanner;
public class ScannerTasks {

    public void grossSalaryCalculation() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Salary :");
        int salary = scn.nextInt();
        System.out.println("Enter HRA :");
        int hra = scn.nextInt();
        System.out.println("Enter DA :");
        int da = scn.nextInt();
        int total = salary + hra + da;

        System.out.println("Your gross salary is " +total);
    }

    public static void electricityBill() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter units :");
        int units = scn.nextInt();
        double totalBill = 0.0;

        if(units <= 50){
            totalBill = units * 3.0;
        } else if (units <= 200) {
            totalBill = units * 5.0;
        } else if (units <= 350) {
            totalBill = units * 6.5;
        } else if (units > 350) {
            totalBill = units * 10;
        }

        double surcharge = units * 2.0;
        double total = totalBill + surcharge;
        System.out.println("Your total bill amount is : " + total);
    }
    public void calculategst() {
        System.out.println("Enter the amount to find the GST :");
        Scanner scan = new Scanner(System.in);
        double total = scan.nextDouble();
        double totalBill = total * (18.0 / 100.0);
        double overall = total + totalBill;
        System.out.println(overall);
    }
    public static void areaofsquare() {
        Scanner areaScanner = new Scanner(System.in);
        System.out.println("Enter the side of the square :");
        double side = areaScanner.nextDouble();
        double area = side * side;
        System.out.println("Area of the square is : " + area);
    }
    public void areaofcircle() {
        Scanner circleaArea = new Scanner(System.in);
        System.out.println("Enter the radius of the circle :");
        double radius = circleaArea.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is : "+area);
    }
    public void calculateAlzebraicFormula() {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter the value of A");
        double aVal = scnr.nextDouble();

        System.out.println("Enter the value of B");
        double bVal = scnr.nextDouble();

        double result = (aVal * aVal) + (bVal * bVal) + (2*aVal*bVal);
        System.out.println("Result : " + result);
    }
    public static void palindromeCheck() {
        Scanner palindromeScnr = new Scanner(System.in);
        System.out.println("Enter number : ");
        int val = palindromeScnr.nextInt();
        int revVal = 0;
        int orgVal = val;

        while(val > 0) {
            int lastVal = val%10;
            revVal = (revVal * 10) + lastVal;
            val = val/10;
        }
        if(orgVal == revVal) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
    public void checkPrimeNumber() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your number :");
        int prmNum = scn.nextInt();

        if(prmNum <= 0) {
            return;
        }
        int cVal = 0;
        for(int i =1;i<=prmNum;i++){
            if(prmNum%i==0){
                cVal++;
            }
        }

        if(cVal == 2) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // System.out.println("Enter number 1 :");
        // int num1 = scn.nextInt();
        // System.out.println("Enter number 2 :");
        // int num2 = scn.nextInt();
        // System.out.println("Enter calculation method :");
        // char c1 = scn.next().charAt(0);
        // int total = 0;
        
        // switch (c1) {
        //     case '+' -> total = num1 + num2;
        //     case '-' -> total = num1 - num2;
        //     case '*' -> total = num1 * num2;
        //     case '/' -> total = num1 / num2;
        //     default -> System.out.println("Invalid input");
        // }
        // System.out.println("Total :");
        // System.out.println(total);

        // System.out.println("---------------------------------------------------------------------");
        // System.out.println("Let's start finding average of number now,");

        // System.out.println("Enter the first decimal value");
        // double dc1 = scn.nextDouble();
        // System.out.println("Enter the second decimal value");
        // double dc2 = scn.nextDouble();
        // System.out.println("Enter the third decimal value");
        // double dc3 = scn.nextDouble();
        // System.out.println("Enter the fourth decimal value");
        // double dc4 = scn.nextDouble();

        // System.out.println("Average of " + dc1 + ", " + dc2 + ", " + dc3 + ", " + dc4 + " is");
        // System.out.println((dc1 + dc2 + dc3 + dc4) / 4);


        // System.out.println("---------------------------------------------------------------------");
        // System.out.println("Let's check a person is eligible for marriage");
        // System.out.println("Enter age :");
        // int age = scn.nextInt();
        // if (age >= 21) {
        //     System.out.println("Eligible");
        // } else {
        //     System.out.println("Not eligible");
        // }

        // System.out.println("---------------------------------------------------------------------");
        // System.out.println("Enter string input 1 :");
        // String s1 = scn.next();
        // scn.nextLine();
        // System.out.println("Enter string input 2 :");
        // String s2 = scn.nextLine();
        // System.out.println("----------------------");
        // System.out.println(s1);
        // System.out.println(s2);

        // System.out.println("-------------------------------------------------------------------");
        // System.out.println("Kindly fill the employee details");

        // System.out.println("Enter employee name :");
        // String name = scn.next();
        // System.out.println("Enter employee id :");
        // int id = scn.nextInt();
        // System.out.println("Enter employee role :");
        // String role = scn.next();
        // System.out.println("Enter employee salary :");
        // int salary = scn.nextInt();
        // System.out.println("Enter company name :");
        // String cname = scn.next();
        // scn.nextLine();
        // System.out.println("Enter employee address :");
        // String empaddress = scn.nextLine();
        // System.out.println("----------------Employee Details----------------");
        // System.out.println("Employee name: " + name);
        // System.out.println("Employee id: " + id);
        // System.out.println("Employee role: " + role);
        // System.out.println("Salary: " + salary);
        // System.out.println("Compnay name: " + cname);
        // System.out.println("Employee Address: " + empaddress);

        // System.out.println("-------------------------------------------------------------------");
        // System.out.println("Kindly fill the inputs");

        // System.out.println("Enter name :");
        // String pName = scn.next();
        // System.out.println("Enter age :");
        // int pAge = scn.nextInt();
        // System.out.println("Enter gender :");
        // String pGender = scn.next();
        // System.out.println("Enter contact number :");
        // Long pContact = scn.nextLong();
        // System.out.println("Enter address :");
        // String pAddress = scn.next();
        // scn.nextLine();
        // System.out.println("Enter pincode :");
        // int pPincode = scn.nextInt();
        // System.out.println("Enter Taluk :");
        // String pTaluk = scn.next();
        // System.out.println("Enter District :");
        // String pDistrict = scn.next();
        // System.out.println("Enter state :");
        // String pState = scn.next();

        // System.out.println("---------------Verify the details below----------------");
        // System.out.println("Name: " + pName);
        // System.out.println("Age: " + pAge);
        // System.out.println("Gender: " + pGender);
        // System.out.println("Contact number: " + pContact);
        // System.out.println("Address: " + pAddress);
        // System.out.println("Pincode: " + pPincode);
        // System.out.println("Taluk: " + pTaluk);
        // System.out.println("District: " + pDistrict);
        // System.out.println("State: " + pState);

        ScannerTasks obj = new ScannerTasks();
        // obj.grossSalaryCalculation();
        // ScannerTasks.electricityBill();
        // obj.calculategst();
        // ScannerTasks.areaofsquare();
        // obj.areaofcircle();
        // obj.calculateAlzebraicFormula();
        // ScannerTasks.palindromeCheck();
        obj.checkPrimeNumber();
    }
    
}