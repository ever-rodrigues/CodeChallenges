package Beecrowd;

import java.util.Scanner;

public class challenge_42_Media {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    float numero,soma=0;
    int cont=0;
    for(int i=0;i<6;i++){
        numero=scan.nextFloat();
        if(numero>0){
            cont+=1;
            soma=soma+numero;
        }
    }
    System.out.printf("%d valores positivos\n",cont);
    System.out.printf("%.1f\n",(soma/cont));

    }
}

