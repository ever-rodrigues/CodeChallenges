package Beecrowd;

import java.util.Scanner;

public class challenge_13_Area {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double pi = 3.14159;
        double A,B,C;
        A=scan.nextDouble();
        B=scan.nextDouble();
        C=scan.nextDouble();
        double areaTriangleRect=(A*C)/2;
        double areaCircle=pi*(C*C);
        double areaTrap=((A+B)*C)/2;
        double areaQuad=(B*B);
        double areaRec=(A*B);
        System.out.printf("TRIANGULO: %.3f\n",areaTriangleRect);
        System.out.printf("CIRCULO: %.3f\n",areaCircle);
        System.out.printf("TRAPEZIO: %.3f\n",areaTrap);
        System.out.printf("QUADRADO: %.3f\n",areaQuad);
        System.out.printf("RETANGULO: %.3f\n",areaRec);

    }
}
