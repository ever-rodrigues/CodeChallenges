package Beecrowd;

import java.util.Scanner;

public class challenge_26_Lanche {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int codigo;
        double preco,quantidade;
        codigo=scan.nextInt();
        quantidade=scan.nextDouble();
        switch (codigo){
            case 1:
                preco=4.00*quantidade;
                System.out.printf("Total: R$ %.2f\n",preco);
                break;
            case 2:
                preco=4.50*quantidade;
                System.out.printf("Total: R$ %.2f\n",preco);
                break;
            case 3:
                preco=5.00*quantidade;
                System.out.printf("Total: R$ %.2f\n",preco);
                break;
            case 4:
                preco=2.00*quantidade;
                System.out.printf("Total: R$ %.2f\n",preco);
                break;
            case 5:
                preco=1.50*quantidade;
                System.out.printf("Total: R$ %.2f\n",preco);
                break;
            }
        }

    }

