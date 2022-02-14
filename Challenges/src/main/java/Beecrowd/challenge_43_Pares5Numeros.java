package Beecrowd;

import java.util.Scanner;

public class challenge_43_Pares5Numeros {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numero,cont=0;
    for(int i =0;i<5;i++){
        numero=scan.nextInt();
        if(numero%2==0){
            cont+=1;
        }
    }
        System.out.printf("%d valores pares\n",cont);


    }
}

