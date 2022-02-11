package Beecrowd;

import java.util.Scanner;

public class challenge_12_Sphere {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double r;
        double volume;
        double pi= 3.14159;
        r=scan.nextDouble();
        volume=((4.0/3)*pi*Math.pow(r,3));
        System.out.printf("VOLUME = %.3f\n",volume);
    }
}
