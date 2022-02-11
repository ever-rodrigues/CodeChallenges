package HackerRank;

import java.util.Scanner;

public class Day02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        double d;
        String t,s;

        i=scan.nextInt();
        d=scan.nextDouble();
        t=scan.next();
        s=scan.nextLine();

        System.out.println(i+4);
        System.out.println(d+4.0);
        System.out.println("HackerRank"+" "+t+s);
    }
}
