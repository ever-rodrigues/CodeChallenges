package Beecrowd;

import java.util.Scanner;

public class challenge_55_SequencialIJ_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=1;
        int j=7;
        int k=0;
        while(i<=9){
            while(k<3){
                System.out.printf("I=%d J=%d\n",i,j);
                k+=1;
                j-=1;
            }
            i+=2;
            j=j+5;
            k=0;
       }

    }
}

