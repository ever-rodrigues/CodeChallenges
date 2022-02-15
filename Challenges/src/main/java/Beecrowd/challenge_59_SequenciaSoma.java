package Beecrowd;

import java.util.Scanner;

public class challenge_59_SequenciaSoma {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int atual,proximo,numero,soma;
        soma=0;
        atual=0;
        proximo=0;
        while ((atual>=0 || proximo>=0)||(atual!=0 || proximo!=0)){
            atual=scan.nextInt();
            proximo=scan.nextInt();
            if((atual==0 || proximo==0)||(atual<0 || proximo<0)){
                break;
            }
            if(atual>proximo){
                numero=atual;
                atual=proximo;
                proximo=numero;
            }
            while (atual<=proximo){
                soma=soma+atual;
                System.out.printf("%d ",atual);
                atual=atual+1;
            }
            System.out.printf("Sum=%d\n",soma);
            soma=0;
        }
    }
}