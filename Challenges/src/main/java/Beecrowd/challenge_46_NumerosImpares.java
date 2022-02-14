package Beecrowd;

import java.util.Scanner;

public class challenge_46_NumerosImpares {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numero;
    numero=scan.nextInt();
    for(int i=1;i<=numero;i++){
        if(i%2!=0){
            System.out.println(i);
        }
    }

    }
}

