package Beecrowd;

import java.util.Scanner;

public class challenge_48_QuadradoDePares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        double result;
        numero=scan.nextInt();
        for(int i=1;i<=numero;i++){
            if(i%2==0){
                result=Math.pow(i,2);
                System.out.printf("%d^2 = %.0f\n",i,result);
            }
        }
    }
}
