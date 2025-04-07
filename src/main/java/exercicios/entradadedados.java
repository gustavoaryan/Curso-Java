package exercicios;

import java.util.Scanner;

public class entradadedados {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("Digite seu nome: " + x);

        sc.close();
    }
}
