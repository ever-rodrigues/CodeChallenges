package Beecrowd;

import java.util.Scanner;

public class challenge_11_SimpleCalc {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        float peaceAStr;
        int peaceA,numPeaceA;
        float peaceAUnityValue;
        float peaceBStr;
        int peaceB,numPeaceB;
        float peaceBUnityValue;
        peaceA=scan.nextInt();
        numPeaceA=scan.nextInt();
        peaceAUnityValue=scan.nextFloat();
        peaceB=scan.nextInt();
        numPeaceB=scan.nextInt();
        peaceBUnityValue=scan.nextFloat();
        float totalPeacaA=numPeaceA*peaceAUnityValue;
        float totalPeacaB=numPeaceB*peaceBUnityValue;
        float somaTotal=totalPeacaA+totalPeacaB;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",somaTotal);
    }
}
