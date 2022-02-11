package Beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class challenge_10_SalaryWithBonus {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        String employeName;
        double sellQuantity,salary;
        double COMMISION=.15;
        System.out.println("Employee name:");
        employeName=scan.next();
        System.out.println("Salary of employee:");
        salary=scan.nextDouble();
        System.out.println(salary);
        System.out.println("Sell quantity");
        sellQuantity=scan.nextDouble();
        System.out.println(sellQuantity);
        salary=((sellQuantity*.15)+salary);
        System.out.println(salary);
        System.out.println("TOTAL SALARY = U$ "+df.format(salary));

    }
}
