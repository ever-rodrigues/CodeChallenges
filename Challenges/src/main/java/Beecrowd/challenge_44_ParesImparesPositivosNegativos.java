package Beecrowd;

import java.util.Scanner;

public class challenge_44_ParesImparesPositivosNegativos {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numero,par,impar,positivo,negativo;
    par=0;
    impar=0;
    positivo=0;
    negativo=0;
    for(int i =0;i<5;i++){
        numero=scan.nextInt();
        if(numero%2==0){
            par+=1;
        }
        if(numero%2!=0){
            impar+=1;
        }
        if(numero<0){
            negativo+=1;
        }
        if(numero>0){
            positivo+=1;
        }
    }
        System.out.printf("%d valor(es) par(es)\n",par);
        System.out.printf("%d valor(es) impar(es)\n",impar);
        System.out.printf("%d valor(es) positivo(s)\n",positivo);
        System.out.printf("%d valor(es) negativo(s)\n",negativo);
    }
}

