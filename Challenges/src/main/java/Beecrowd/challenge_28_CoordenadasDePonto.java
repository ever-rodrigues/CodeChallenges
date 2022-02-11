package Beecrowd;

import java.util.Scanner;

public class challenge_28_CoordenadasDePonto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float x,y;
        x=scan.nextFloat();
        y=scan.nextFloat();
        if(x==y && y==0.0){
            System.out.println("Origem");
        }
        else  if(x==0.0 && y!=0.0){
            System.out.println("Eixo Y");
        }
        else if(y==0.0 && x!=0.0){
            System.out.println("Eixo X");
        }
        else if(x>0.0 && y>0.0){
            System.out.println("Q1");
        }
        else if(x<0.0 && y>0.0){
            System.out.println("Q2");
        }
        else if(x<0.0 && y<0.0){
            System.out.println("Q3");
        }
        else
            System.out.println("Q4");
    }
}
