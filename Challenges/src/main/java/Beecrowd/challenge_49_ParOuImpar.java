package Beecrowd;

import java.util.Scanner;

public class challenge_49_ParOuImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,numero;
        n=scan.nextInt();
        for(int i=0;i<n;i++){
            numero=scan.nextInt();
            if(numero%2==0 && numero>0){
                System.out.println("EVEN POSITIVE");
            }
            if(numero%2==0 && numero<0){
                System.out.println("EVEN NEGATIVE");
            }

            if(numero%2!=0 && numero>0){
                System.out.println("ODD POSITIVE");
            }
            if(numero%2!=0 && numero<0) {
                System.out.println("ODD NEGATIVE");
            }
            if(numero==0){
                System.out.println("NULL");
            }
        }
    }
}
