package Beecrowd;

import java.util.Scanner;

public class challenge_51_MaioNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int atual,maior,posicao=0;
        atual=0;
        maior=0;
        int i=0;
        while (i<5){
            atual=scan.nextInt();
            if(atual>maior){
                maior=atual;
                posicao=i+1;
            }
            i+=1;
        }
        System.out.println(maior);
        System.out.println(posicao);
    }
}

