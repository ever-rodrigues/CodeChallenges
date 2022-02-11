package Beecrowd;

import java.util.Scanner;

public class challenge_39_Mes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor;
        valor=scan.nextInt();
        String[] meses={"","January","February","March","April","May","June","July","August","September","October","November","December"};
        for(int i=0;i<meses.length;i++){
            if(valor==i){
                System.out.println(meses[i]);
            }
        }
    }
}