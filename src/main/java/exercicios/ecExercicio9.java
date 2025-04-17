package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ecExercicio9 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        /*
        if (n >= 0 && n <= 25){
            System.out.printf("O número está entre 0 e 25");
        } else if (n > 25 && n < 50) {
            System.out.printf("O número está entre 25 e 50");
        } else if (n > 50 && n < 75) {
            System.out.printf("O número está entre 50 e 75");
        } else if (n > 75 && n < 100) {
            System.out.printf("O número está entre 75 e 100");
        } else {
            System.out.printf("O número não está nesse intervalo");
        }
        */
        if (n < 0.0 || n > 100.0) {
            System.out.println("Fora de intervalo");
        }
        else if (n <= 25.0) {
            System.out.println("Intervalo é entre 0 e 25");
        }
        else if (n <= 50.0) {
            System.out.println("Intervalo é entre 25 e 50");
        }
        else if (n <= 75.0) {
            System.out.println("Intervalo é entre 50 e 75");
        }
        else {
            System.out.println("Intervalo é entre 75 e 100");
        }

        sc.close();
    }
}