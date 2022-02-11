package Beecrowd;

import java.util.Scanner;

public class challenge_16_DistanciaEntreDois {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double distancia;
        double z,x1,x2,y1,y2,k;
        x1=scan.nextDouble();
        y1=scan.nextDouble();
        x2=scan.nextDouble();
        y2=scan.nextDouble();
        z=x2-x1;
        k=y2-y1;
        distancia=Math.sqrt((Math.pow(z,2)) + (Math.pow(k,2)));
        System.out.printf("%.4f\n",distancia);
    }
}
