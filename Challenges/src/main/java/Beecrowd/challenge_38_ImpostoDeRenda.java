package Beecrowd;

import java.util.Scanner;

public class challenge_38_ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double renda,valorAPagar,imposto,isento,taxa8,taxa18,taxa28,faixa;
        isento=2000;
        taxa8=.08;
        taxa18=.18;
        taxa28=.28;
        renda=scan.nextDouble();
        if(renda<2000.00){
            System.out.println("Isento");
        }
        else if(renda>2000.00 &&renda<=3000){
            faixa=2000.00;
            taxa8=renda-faixa;
            imposto=taxa8*.08;
        }
        else if(renda>3000.00 && renda<=4500.00){
            faixa=3000.00;
            taxa18=renda-faixa;
            taxa8=renda-isento-taxa18;
            imposto=(taxa18*.18)+(taxa8*.08);
            System.out.printf("R$ %.2f\n",imposto);
        }
        else if(renda>4500.00){
            faixa=4500.00;
            taxa28=renda-faixa;
            taxa18=renda-taxa28-3000;
            taxa8=1000*.08;
            imposto=(taxa28*.28)+(taxa18*.18)+(taxa8);
            System.out.printf("R$ %.2f\n",imposto);
        }

    }
}