package Beecrowd;

import java.util.Scanner;

import static java.lang.Math.abs;

public class challenge_14_OMaior {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int A,B,C,maiorAB;
        A=scan.nextInt();
        B=scan.nextInt();
        C=scan.nextInt();
        maiorAB =(A+B+abs(A-B))/2;
        maiorAB=(C+maiorAB+abs(maiorAB-C))/2;
        System.out.println(maiorAB+" eh o maior");

    }
}
