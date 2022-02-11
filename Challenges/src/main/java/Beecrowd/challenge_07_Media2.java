package Beecrowd;

import java.util.Scanner;

public class challenge_07_Media2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double A,B,C,media;
        System.out.println("Valor A");
        A=scan.nextDouble();
        System.out.println("VAlor B");
        B=scan.nextDouble();
        System.out.println("VAlor C");
        C=scan.nextDouble();
        media=(((A*2)+(B*3)+(C*5))/10);
        System.out.printf("MEDIA = %.1f\n",media);
    }
}
