package Beecrowd;

import java.util.Scanner;

public class challenge_06_Media {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double A,B,media;
        System.out.println("Valor A");
        A=scan.nextDouble();
        System.out.println("VAlor B");
        B=scan.nextDouble();
        media=(((A*3.5)+(B*7.5))/11);
        System.out.printf("MEDIA = %.5f\n",media);
    }
}
