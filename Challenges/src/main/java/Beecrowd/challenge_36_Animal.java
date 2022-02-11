package Beecrowd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class challenge_36_Animal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String entrada1,entrada2,entrada3;
        entrada1=scan.next();
        entrada2=scan.next();
        entrada3=scan.next();
        if(entrada1.equals("vertebrado")){
            if(entrada2.equals("ave")){
                if(entrada3.equals("carnivoro")){
                    System.out.println("aguia");
                }
                else{
                    System.out.println("pomba");
                }
            }
            else {
                if(entrada3.equals("onivoro")){
                    System.out.println("homem");
                }
                else System.out.println("vaca");

                }
        }
        else {
            if(entrada2.equals("inseto")){
                if(entrada3.equals("hematofago")){
                    System.out.println("pulga");
                }
                else
                    System.out.println("lagarta");
                }
            else {
                if(entrada3.equals("onivoro")){
                    System.out.println("minhoca");
                }
                else System.out.println("sanguessuga");
            }
        }
    }
}