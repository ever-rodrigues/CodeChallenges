package Beecrowd;

import java.util.Scanner;

public class challenge_20_ConversaoTempo {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int valor,horas,minutos,segundos,resto;
        valor= scan.nextInt();
        //60 segundos = 1 minuto
        //1 hora = 60 minutos
        //1 hora = 3600 segundos

        horas=valor/3600;
        resto=valor%3600;
        valor=resto;

        minutos=valor/60;
        resto=valor%60;
        valor=resto;

        segundos=valor%60;
        System.out.println(horas+":"+minutos+":"+segundos);
        }

    }

