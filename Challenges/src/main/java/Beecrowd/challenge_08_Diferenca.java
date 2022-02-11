package Beecrowd;

import java.util.Scanner;

public class challenge_08_Diferenca {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int A,B,C,D,diferenca;
        System.out.println("Valor A");
        A=scan.nextInt();
        System.out.println("VAlor B");
        B=scan.nextInt();
        System.out.println("VAlor C");
        C=scan.nextInt();
        System.out.println("VAlor D");
        D=scan.nextInt();
        diferenca=((A*B)-(C*D));
        System.out.println("DIFERENCA = "+diferenca);
    }
}
