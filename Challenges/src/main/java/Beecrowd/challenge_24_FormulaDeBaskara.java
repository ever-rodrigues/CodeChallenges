package Beecrowd;

import java.util.Scanner;

public class challenge_24_FormulaDeBaskara {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double A,B,C,bhaskaraMais,bhaskaraMenos,delta;
        A=scan.nextDouble();
        B=scan.nextDouble();
        C=scan.nextDouble();
        delta=(B*B)-4*A*C;
        bhaskaraMais=((B*-1)+Math.sqrt(delta))/(2*A);
        bhaskaraMenos=((B*-1)-Math.sqrt(delta))/(2*A);

        if(delta>=0 && A!=0){
            System.out.printf("R1 = %.5f\n",bhaskaraMais);
            System.out.printf("R2 = %.5f\n",bhaskaraMenos);
        }
        else {
            System.out.println("Impossivel calcular");
            }
        }

    }

