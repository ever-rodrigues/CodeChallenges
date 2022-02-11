package Beecrowd;

import java.util.Arrays;
import java.util.Scanner;

public class challenge_30_Trinagulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float A,B,C,perimetro,areaTrapezio;
        A=scan.nextFloat();
        B=scan.nextFloat();
        C=scan.nextFloat();
        if(A+B>C && B+C>A && A+C>B){
            perimetro=A+B+C;
            System.out.println("Perimetro = "+perimetro);
       }
        else{
            areaTrapezio=(((A+B)/2)*C);
            System.out.println("Area = "+areaTrapezio);
        }
    }
}
