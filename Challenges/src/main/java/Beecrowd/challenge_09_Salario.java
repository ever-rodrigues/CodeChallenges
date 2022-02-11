package Beecrowd;

import java.util.Scanner;

public class challenge_09_Salario {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int idFunc;
        float workHours,valueHour,salary;
        System.out.println("Id employee");
        idFunc=scan.nextInt();
        System.out.println("Work Hours:");
        workHours=scan.nextFloat();
        System.out.println("Value of hour");
        valueHour=scan.nextFloat();
        salary=(workHours*valueHour);
        System.out.println("NUMBER = "+idFunc);
        System.out.printf("SALARY = U$ %.2f",salary);

    }
}
