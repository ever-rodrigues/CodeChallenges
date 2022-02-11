package Beecrowd;

import java.util.Arrays;
import java.util.Scanner;

public class challenge_33_TempoDeJogo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int horaInicial,horaFinal,dia,tolalHoras;
        horaInicial=scan.nextInt();
        horaFinal=scan.nextInt();
        dia=24;
        if(horaInicial>horaFinal){
            horaInicial=dia-horaInicial;
            tolalHoras=horaInicial+horaFinal;
            System.out.println("O JOGO DUROU "+tolalHoras+" HORA(S)");
        }
        else if(horaInicial==horaFinal){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        else {
            tolalHoras=horaFinal-horaInicial;
            System.out.println("O JOGO DUROU "+tolalHoras+" HORA(S)");
        }



    }

}