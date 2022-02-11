package Beecrowd;

import java.util.Scanner;

public class challenge_17_Distancia {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int xVelocidade,yVelocidade,distancia,minutos;
        xVelocidade=60;
        yVelocidade=90;
        minutos=scan.nextInt();
        distancia=minutos*2;
        System.out.println(distancia+" minutos");
    }
}
