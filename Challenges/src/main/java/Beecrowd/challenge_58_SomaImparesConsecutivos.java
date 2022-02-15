package Beecrowd;

import java.util.Scanner;

public class challenge_58_SomaImparesConsecutivos {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n,primeiro,segundo,numero;
        n=scan.nextInt();
        int soma=0;
        for(int i=0;i<n;i++){
            primeiro=scan.nextInt();
            segundo=scan.nextInt();
            numero=primeiro;
            if(primeiro>segundo){
                numero=primeiro;
                primeiro=segundo;
                segundo=numero;
            }
            while (primeiro<segundo){
                if((primeiro+1)!=segundo){
                    if((primeiro+1)%2!=0){
                        soma=soma+primeiro+1;
                    }
                }
                primeiro+=1;
            }
            System.out.println(soma);
            soma=0;
        }
    }
}