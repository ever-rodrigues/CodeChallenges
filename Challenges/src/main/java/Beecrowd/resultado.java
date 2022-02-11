package Beecrowd;
import java.util.Scanner;
public class resultado {
    float media,novaMedia;
    int contador=0;

    public resultado(float media) {
        this.media = media;
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
                Scanner scan= new Scanner(System.in);
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
