package Beecrowd;

import java.util.Scanner;

public class challenge_53_SequencialIJ_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=1;
        int j=60;
        while(j>=0){
            System.out.printf("I=%d J=%d\n",i,j);
            i+=3;
            j-=5;
       }

    }
}

