package Beecrowd;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class challenge_32_TiposDeTriangulos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float A,B,C;
        A=scan.nextFloat();
        B=scan.nextFloat();
        C=scan.nextFloat();
        float[] lados={A,B,C};
        Arrays.sort(lados);
        A=lados[2];
        B=lados[1];
        C=lados[0];
        if(A>=B+C){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else{
            if(Math.pow(A,2)==(Math.pow(B,2)+Math.pow(C,2))){
                System.out.println("TRIANGULO RETANGULO");
            }
            if(Math.pow(A,2)>(Math.pow(B,2)+Math.pow(C,2))){
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if(Math.pow(A,2)<(Math.pow(B,2)+Math.pow(C,2))){
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if(A==B && B==C){
                System.out.println("TRIANGULO EQUILATERO");
            }
            if(A==B && B!=C || A==C && C!=B || B==C && C !=A){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

    }

}