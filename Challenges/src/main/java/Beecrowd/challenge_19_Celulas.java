package Beecrowd;

import java.util.Scanner;

public class challenge_19_Celulas {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int valor,resto,quociente;
        valor=scan.nextInt();
        System.out.println(valor);

        quociente=valor/100;
        resto=valor%100;
        System.out.println(quociente+" nota(s) de R$ 100,00");
        valor=resto;

        quociente=valor/50;
        resto=valor%50;
        System.out.println(quociente+" nota(s) de R$ 50,00");
        valor=resto;

        quociente=valor/20;
        resto=valor%20;
        System.out.println(quociente+" nota(s) de R$ 20,00");
        valor=resto;

        quociente=valor/10;
        resto=valor%10;
        System.out.println(quociente+" nota(s) de R$ 10,00");
        valor=resto;

        quociente=valor/5;
        resto=valor%5;
        System.out.println(quociente+" nota(s) de R$ 5,00");
        valor=resto;

        quociente=valor/2;
        resto=valor%2;
        System.out.println(quociente+" nota(s) de R$ 2,00");
        valor=resto;

        quociente=valor/1;
        resto=valor%1;
        System.out.println(quociente+" nota(s) de R$ 1,00");
        valor=resto;
        }

    }

