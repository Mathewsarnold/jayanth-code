public class Conditions {
    public static void main (String [] args) {
        int size = 40;
        if(size >= 28 && size <= 32) {
            System.out.println("Small");
        } else if (size > 32 && size <= 38) {
            System.out.println("Medium");
        } else if (size > 38 && size <= 44) {
            System.out.println("Large");
        } else if (size > 44) {
            System.out.println("Extra Large");
        }

        int mark = 43;
        if(mark > 90) {
            System.out.println("Grade: A+");
        } else if (mark >= 80 && mark < 90) {
            System.out.println("Grade: A");
        } else if (mark >= 70 && mark < 80) {
            System.out.println("Grade: B+");
        } else if (mark >= 60 && mark < 70) {
            System.out.println("Grade: B");
        } else if (mark >= 50 && mark < 60) {
            System.out.println("Grade: C");
        } else if (mark >= 40 && mark < 50) {
            System.out.println("Grade: D");
        } else if (mark < 40) {
            System.out.println("Grade: E");
        }

        int chck = 70;
        if(chck % 3 == 0) {
            System.out.println("Divisible by 3");
        } else if (chck % 5 == 0) {
            System.out.println("Divisible by 5");
        } else if (chck % 7 == 0) {
            System.out.println("Divisible by 7");
        } else if (chck % 9 == 0) {
            System.out.println("Divisible by 9");
        }else if (chck % 11 == 0) {
            System.out.println("Divisible by 11");
        }

        int units = 313;
        double amount = 0.0;
        if(units > 0 && units <= 50) {
            amount = units * 0.5;
        } else if (units > 51 && units <= 150) {
            amount = units * 1.0;
        } else if (units > 151 && units <= 210) {
            amount = units * 1.5;
        } else if (units > 210 && units <= 280) {
            amount = units * 2.0;
        } else {
            amount = units * 4.0;
        }
        double surcharge = amount * 0.2;
        double total = amount + surcharge;
        System.out.println("Amount: " + amount);
        System.out.println("Surcharge :" + surcharge);
        System.out.println("Total Bill: " + total);

        double baseSalary = 15000;
        double da = 0.0;
        double hra = 0.0;

        if (baseSalary <= 10000) {
            da = 0.80;
            hra = 0.10;
        } else if (baseSalary <= 20000) {
            da = 0.85;
            hra = 0.15;
        } else if (baseSalary <= 30000) {
            da = 0.90;
            hra = 0.20;
        } else if (baseSalary <= 40000) {
            da = 0.95;
            hra = 0.25;
        }

        double daAmount = baseSalary * da;
        double hraAmount = baseSalary * hra;
        double grossSalary = baseSalary + daAmount + hraAmount;
        System.out.println("-------------------------------------------");

        System.out.println("Gross salary: " + grossSalary);

    }
}