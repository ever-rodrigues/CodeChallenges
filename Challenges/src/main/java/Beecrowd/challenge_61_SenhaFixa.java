package Beecrowd;

import java.util.Scanner;

public class challenge_61_SenhaFixa {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int senha=2002;
        int usuario=0;
        while (usuario!=senha){
            usuario=scan.nextInt();
            if(usuario!=senha){
                System.out.println("Senha Invalida");;
            }
        }
        System.out.println("Acesso Permitido");
    }
}