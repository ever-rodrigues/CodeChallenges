package Beecrowd;

import java.util.Scanner;

public class challenge_50_Resto2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n=scan.nextInt();
        for(int i=1;i<=10000;i++){
            if(i%n==2){
                System.out.println(i);
            }
        }

    }
}

