package Beecrowd;

import java.util.Scanner;

public class challenge_56_SequencialIJ_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float i = 0;
        float j = 0;
        float z = 0;
        int k = 0;
        while (i < 2.2) {
            if (k <= 3) {
                System.out.printf("%.1f %.1f \n", i,j);

            } else {
                System.out.printf("%.1f %.1f \n", i,j);
            }
            k += 1;
            if (k == 2) {
                i += .2;
                z += .2;
                j = z;
                k = 0;
                k += 2;
            }
            if (k == 5) {
                k = 0;
            }
            j+=1;
        }
    }
}

