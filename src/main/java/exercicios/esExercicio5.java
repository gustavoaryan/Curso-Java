package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class esExercicio5 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double raio = sc.nextDouble();

        double area = pi * raio * raio;

        System.out.printf("Area= %.4f%n", area);

        sc.close();
    }
}