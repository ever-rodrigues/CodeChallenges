package Beecrowd;

import java.util.Scanner;
public class challenge_03_AreaCirculo {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double area;
        double raio;
        System.out.println("Digite o valor para o raio");
        raio=scan.nextDouble();
        double PI =3.14159;
        area= PI * Math.pow(raio,2);
        System.out.printf("A=%.4f\n",area);
    }
}
