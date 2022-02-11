package Beecrowd;

import java.util.Scanner;

public class challenge_35_AumentoDeSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salario,novoSalario,reajuste,percentual;
        salario=scan.nextDouble();
        if(salario<=400.00){
            percentual=15;
            reajuste=salario*0.15;
            novoSalario=salario+reajuste;
            System.out.printf("Novo salario: %.2f\n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);
            System.out.printf("Em percentual: %.0f %%\n",percentual);
        }
        else if(salario>400.00 && salario<=800.00){
            percentual=12;
            reajuste=salario*0.12;
            novoSalario=salario+reajuste;
            System.out.printf("Novo salario: %.2f\n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);
            System.out.printf("Em percentual: %.0f %%\n",percentual);
        }
        else if(salario>800.00 && salario<=1200.00){
            percentual=10;
            reajuste=salario*0.10;
            novoSalario=salario+reajuste;
            System.out.printf("Novo salario: %.2f\n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);
            System.out.printf("Em percentual: %.0f %%\n",percentual);
        }
        else if(salario>1200.00 && salario<=2000.00){
            percentual=7;
            reajuste=salario*0.07;
            novoSalario=salario+reajuste;
            System.out.printf("Novo salario: %.2f\n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);
            System.out.printf("Em percentual: %.0f %%\n",percentual);
        }
        else if(salario>2000.00){
            percentual=4;
            reajuste=salario*0.04;
            novoSalario=salario+reajuste;
            System.out.printf("Novo salario: %.2f\n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);
            System.out.printf("Em percentual: %.0f %%\n",percentual);
        }


    }
}