package Beecrowd;

import java.util.Scanner;

public class challenge_21_IdadeEmDias {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int valor,dias,anos,meses,resto;
        valor=scan.nextInt();

        //anos = 365dias
        //mes=30 dias

        //480 -> 1 ANos -> 115 Dias sobram ->3 Meses -> Sobram 25 Dias

        anos = valor/365;
        resto=valor%365;
        valor=resto;
        System.out.println(anos+" ano(s)");

        meses=valor/30;
        System.out.println(meses+" mes(es)");
        resto=valor%30;
        valor=resto;
        dias=valor;

        System.out.println(dias+" dia(s)");

        }

    }

