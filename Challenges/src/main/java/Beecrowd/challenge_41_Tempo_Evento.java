package Beecrowd;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.Scanner;

public class challenge_41_Tempo_Evento {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int segundoInicial,minutoInicial, horaInicial,diaInicial;
    int segundoFinal,minutoFinal,horaFinal,diaFinal;
    int segundos,minutos,horas,dias,diaInicialSegundos,diaFinalSegundos,total,resto;
    String stringDadosInicio;
    String stringDiaInicio=scan.nextLine();
    String[] arrayDiaInicio=stringDiaInicio.split("Dia ");
    diaInicial=Integer.parseInt(arrayDiaInicio[1]);
//    System.out.println(diaInicial);
    stringDadosInicio=scan.nextLine();
    String[] dadosInicio=stringDadosInicio.split(" : ");
    horaInicial=Integer.parseInt(dadosInicio[0]);
    minutoInicial=Integer.parseInt(dadosInicio[1]);
    segundoInicial=Integer.parseInt(dadosInicio[2]);
//    System.out.println(horaInicial);
//    System.out.println(minutoInicial);
//    System.out.println(segundoInicial);

    String stringDadosFinal;
    String stringDiaFinal= scan.nextLine();
    String[] arrayDiaFinal=stringDiaFinal.split("Dia ");
    diaFinal=Integer.parseInt(arrayDiaFinal[1]);

    stringDadosFinal=scan.nextLine();
    String[] dadosFinal = stringDadosFinal.split(" : ");
    horaFinal=Integer.parseInt(dadosFinal[0]);
    minutoFinal=Integer.parseInt(dadosFinal[1]);
    segundoFinal=Integer.parseInt(dadosFinal[2]);

    diaInicialSegundos=diaInicial*(24*60*60)+horaInicial*60*60 +minutoInicial*60 +segundoInicial;
    diaFinalSegundos=diaFinal*(24*60*60)+horaFinal*60*60+minutoFinal*60+segundoFinal;


    total=diaFinalSegundos-diaInicialSegundos;

    dias=total/(24*60*60);
    resto=total%(24*60*60);
    System.out.printf("%d dia(s)\n",dias);
    horas = resto/(60*60);
    resto=resto%(60*60);
    System.out.printf("%d hora(s)\n",horas);
    minutos=resto/(60);
    resto=resto%60;
    System.out.printf("%d minuto(s)\n",minutos);
    segundos=resto;
    System.out.printf("%d segundo(s)\n",segundos);

    }
}