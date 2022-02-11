package Beecrowd;

import java.util.Scanner;

public class challenge_34_TempoDeJogoMinutos_v2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int horaInicial = scan.nextInt();
        int minutoInicial = scan.nextInt();
        int totalMinutos = horaInicial * 60 + minutoInicial;

        int horaFinal = scan.nextInt();
        int minutoFinal = scan.nextInt();
        int totalMinutosFinal = horaFinal * 60 + minutoFinal;

        int diferencaMinutos = (24 * 60 - totalMinutos) + totalMinutosFinal;

        int horas = diferencaMinutos / 60;
        int minutos = diferencaMinutos % 60;

        if (horas >= 24 && minutos >= 1) {
            horas = horas % 24;
        };

        System.out.printf("O JOGO DUROU %s HORA(S) E %s MINUTO(S)\n", horas, minutos);
    }

}