package Beecrowd;

import java.util.Scanner;

public class challenge_45_6NumerosImpares {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numero,contador=12;

    numero=scan.nextInt();
    for(int i=0;i<contador;i++){
        if((numero+i)%2!=0){
            System.out.println(numero+i);
        }
      }
    }
}

