package Beecrowd;

import java.util.Scanner;

public class challenge_15_OConsumo {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double distancia;
        double combustivel;
        distancia=scan.nextDouble();
        combustivel=scan.nextDouble();
        double kmLitro=distancia/combustivel;
        System.out.printf("%.3f km/l\n",kmLitro);


    }
}
