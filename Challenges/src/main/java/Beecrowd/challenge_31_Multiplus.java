package Beecrowd;

import java.util.Scanner;

public class challenge_31_Multiplus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A,B;
        A=scan.nextInt();
        B=scan.nextInt();
        if(B%A==0 || A%B==0){
            System.out.println("Sao Multiplos");
        }
        else
            System.out.println("Nao sao Multiplos");
    }

}