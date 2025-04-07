package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class esExercicio9 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double triangulo = a * c / 2.0;
        double circulo = 3.14159 * c * c;
        double trapezio = (a + b) / 2.0 * c;
        double quadrado = b * b;
        double retangulo = a * b;

        System.out.printf("Triângulo: %.3f%n", triangulo);
        System.out.printf("Círculo: %.3f%n", circulo);
        System.out.printf("Trapézio: %.3f%n", trapezio);
        System.out.printf("Quadrado: %.3f%n", quadrado);
        System.out.printf("Retângulo: %.3f%n", retangulo);

        sc.close();
    }
}