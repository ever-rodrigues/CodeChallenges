package Beecrowd;

import java.util.Scanner;

public class challenge_60_CrescenteEDecrecente {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int x,y,num;
        x=0;
        y=1;
        while (x!=y){
            x=scan.nextInt();
            y=scan.nextInt();
            if(x==y){
                break;
            }
            if(x<y){
                System.out.println("Crescente");
            }
            if(x>y){
                System.out.println("Decrescente");
            }
        }
    }
}