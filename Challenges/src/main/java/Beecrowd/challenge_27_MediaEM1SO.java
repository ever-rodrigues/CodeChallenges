package Beecrowd;

import java.util.Scanner;

public class challenge_27_MediaEM1SO {
    public static void main(String[] args) {
                Scanner scan= new Scanner(System.in);
                float n1,n2,n3,n4,media,novaMedia;
                int contador=0;

                n1=scan.nextFloat();
                n2=scan.nextFloat();
                n3=scan.nextFloat();
                n4=scan.nextFloat();

                media=((n1*2)+(n2*3)+(n3*4)+(n4*1))/10.0f;
                System.out.printf("Media: %.1f\n",media);

                if(media>=7.0){
                    System.out.println("Aluno aprovado.");
                }
                else if(media<5.0){
                    System.out.println("Aluno reprovado.");
                }
                else
                    while (contador<1){
                        System.out.println("Aluno em exame.");
                        float exame;
                        exame=scan.nextFloat();
                        System.out.println("Nota do exame: "+exame);
                        novaMedia = (exame+media)/2;
                        if(novaMedia>=5.0){
                            System.out.println("Aluno aprovado.");
                            System.out.println("Media final: "+novaMedia);
                            contador+=1;
                        }
                        else {
                            System.out.println("Aluno reprovado.");
                            System.out.println("Media final: "+novaMedia);
                            contador+=1;
                        }

                    }
            }
}
