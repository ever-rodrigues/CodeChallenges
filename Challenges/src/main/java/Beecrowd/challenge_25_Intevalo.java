package Beecrowd;

import java.util.Scanner;

public class challenge_25_Intevalo {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double valor;
        valor=scan.nextDouble();
        if(valor>=0 && valor<=25.00){
            System.out.println("Intervalor [0,25]");
        }
        else if(valor>=25.00 &&valor<=50){
            System.out.println("Intervalor (25,50]");
        }
        else if(valor>=75.00 &&valor<=100.00){
            System.out.println("Intervalor (75,100]");
        }
        else
            System.out.println("Fora de Intervalo");

        }

    }

