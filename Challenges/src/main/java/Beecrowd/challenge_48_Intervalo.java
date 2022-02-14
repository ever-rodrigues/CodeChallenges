package Beecrowd;

import java.util.Scanner;

public class challenge_48_Intervalo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,intervaloInicial,intervaloFinal,numero,contadorIntervalo,contadorForaIntervalo;
        intervaloInicial=10;
        intervaloFinal=20;
        contadorIntervalo=0;
        contadorForaIntervalo=0;
        n=scan.nextInt();
        for(int i=0;i<n;i++){
            numero=scan.nextInt();
            if(numero>=10 &&numero<=20){
                contadorIntervalo+=1;
            }
            else
                contadorForaIntervalo+=1;
        }
        System.out.printf("%d in\n",contadorIntervalo);
        System.out.printf("%d out\n",contadorForaIntervalo);
    }
}
