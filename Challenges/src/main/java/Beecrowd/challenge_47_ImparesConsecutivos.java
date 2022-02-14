package Beecrowd;

import java.util.Scanner;

public class challenge_47_ImparesConsecutivos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroA, numeroB, numero, maior, menor, soma = 0;
        numeroA = scan.nextInt();
        numeroB = scan.nextInt();
        menor = 0;
        maior = 0;
        if (numeroA < numeroB) {
            menor = numeroA;
            maior = numeroB;
        }
        if (numeroA > numeroB) {
            menor = numeroB;
            maior = numeroA;
        }
        menor=menor+1;
        while (menor < maior) {
            if (menor % 2 != 0) {
                soma = soma+menor;
            }
            menor += 1;
        }
        System.out.println(soma);
    }
}
