package Beecrowd;

import java.util.Scanner;
public class challenge_22_NotasEMoedas {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double valor,valorDecimal;
        int valorInteiro,quociente,resto,moeda;
        valor=scan.nextDouble();
        valorInteiro= (int) valor;
        valorDecimal=valor-valorInteiro;
        moeda=(int) (valorDecimal*100);
        System.out.println("NOTAS:");
        quociente=valorInteiro/100;
        resto=valorInteiro%100;
        System.out.println(quociente+" nota(s) de R$ 100.00");
        valorInteiro=resto;

        quociente=valorInteiro/50;
        resto=valorInteiro%50;
        System.out.println(quociente+" nota(s) de R$ 50.00");
        valorInteiro=resto;

        quociente=valorInteiro/20;
        resto=valorInteiro%20;
        System.out.println(quociente+" nota(s) de R$ 20.00");
        valorInteiro=resto;

        quociente=valorInteiro/10;
        resto=valorInteiro%10;
        System.out.println(quociente+" nota(s) de R$ 10.00");
        valorInteiro=resto;

        quociente=valorInteiro/5;
        resto=valorInteiro%5;
        System.out.println(quociente+" nota(s) de R$ 5.00");
        valorInteiro=resto;

        quociente=valorInteiro/2;
        resto=valorInteiro%2;
        System.out.println(quociente+" nota(s) de R$ 2.00");
        valorInteiro=resto;

        System.out.println("MOEDAS:");
        quociente=valorInteiro/1;
        resto=valorInteiro%1;
        System.out.println(quociente+" moeda(s) de R$ 1.00");
        valorInteiro=resto;

        quociente=moeda/50;
        resto=moeda%50;
        System.out.println(quociente+" moeda(s) de R$ 0.50");
        moeda=resto;

        quociente=moeda/25;
        resto=moeda%25;
        System.out.println(quociente+" moeda(s) de R$ 0.25");
        moeda=resto;

        quociente=moeda/10;
        resto=moeda%10;
        System.out.println(quociente+" moeda(s) de R$ 0.10");
        moeda=resto;

        quociente=moeda/5;
        resto=moeda%5;
        System.out.println(quociente+" moeda(s) de R$ 0.05");
        moeda=resto;

        quociente=moeda/1;
        resto=moeda%1;
        System.out.println(quociente+" moeda(s) de R$ 0.01");
        moeda=resto;

        }

    }

