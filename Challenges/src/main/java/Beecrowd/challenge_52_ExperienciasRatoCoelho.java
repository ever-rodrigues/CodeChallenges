package Beecrowd;

import java.util.Scanner;

public class challenge_52_ExperienciasRatoCoelho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        String[] cobaias={"sapos","ratos","coelhos"};
        char[] caractere={'S','R','C'};
        Double[] contador={0.0,0.0,0.0};
        String entrada;
        double somatotal=0,quantidade=0;
        n=scan.nextInt();
        for(int i=0;i<n;i++){
            quantidade=scan.nextInt();
            entrada=scan.next();
            if(entrada.charAt(0)=='S'){
                contador[0]=contador[0] + quantidade;
            }
            else if(entrada.charAt(0)=='R'){
                contador[1]=contador[1] + quantidade;
            }
            else if(entrada.charAt(0)=='C'){
                contador[2]=contador[2]+ quantidade;
            }
            somatotal=somatotal+quantidade;

        }
        System.out.printf("Total: %.0f cobaias\n",somatotal);
        System.out.printf("Total de coelhos: %.0f\n",contador[2]);
        System.out.printf("Total de ratos: %.0f\n",contador[1]);
        System.out.printf("Total de sapos: %.0f\n",contador[0]);
        System.out.printf("Percentual de coelhos: %.2f %%\n",((contador[2]*100)/somatotal));
        System.out.printf("Percentual de ratos: %.2f %%\n",((contador[1]*100)/somatotal));
        System.out.printf("Percentual de sapos: %.2f %%\n",((contador[0]*100)/somatotal));

    }
}

