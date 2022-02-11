package Beecrowd;

import java.util.Scanner;

public class challenge_18_GastoDeCombustivel {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double velocidadeMedia,distancia,tempoGasto,usoLitro;
        usoLitro=12;
        tempoGasto=scan.nextDouble();
        velocidadeMedia=scan.nextDouble();
        distancia=(tempoGasto*velocidadeMedia)/usoLitro;
        System.out.printf("%.3f\n",distancia);
    }
}
