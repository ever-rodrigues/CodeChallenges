package Beecrowd;

import java.util.Scanner;

public class challenge_34_TempoDeJogoMinutos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int horaInicial,minutoInicial,horaFinal,minutoFinal,dia,tolalHoras,totalMinutos;
        horaInicial=scan.nextInt();
        minutoInicial=scan.nextInt();
        horaFinal=scan.nextInt();
        minutoFinal=scan.nextInt();
        if(horaInicial>horaFinal && minutoInicial>minutoFinal){
            dia=24;
            horaInicial=dia-horaInicial;
            tolalHoras=horaInicial+horaFinal;
            totalMinutos=minutoFinal-minutoInicial;
            System.out.println("O JOGO DUROU "+tolalHoras+" HORA(S) E "+totalMinutos+" MINUTO(S)");
        }
        else if(horaInicial==horaFinal && minutoInicial==minutoFinal){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        else if(horaFinal-horaInicial==1 && minutoInicial>minutoFinal){
            tolalHoras=0;
            totalMinutos=minutoFinal-minutoInicial;
            totalMinutos=totalMinutos+60;
            System.out.println("O JOGO DUROU "+tolalHoras+" HORA(S) E "+totalMinutos+" MINUTO(S)");
        }
        else {
            tolalHoras=horaFinal-horaInicial;
            totalMinutos=minutoFinal-minutoInicial;
            System.out.println("O JOGO DUROU "+tolalHoras+" HORA(S) E "+totalMinutos+" MINUTO(S)");
        }

    }

}