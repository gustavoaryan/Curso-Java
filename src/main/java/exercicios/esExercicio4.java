package exercicios;

import java.util.Scanner;

public class esExercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int soma = x + y;
        int subtracao = x - y;
        int multiplicacao = x * y;
        int divisao = x / y;

        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + subtracao);
        System.out.println("Multiplicação = " + multiplicacao);
        System.out.println("Divisão = " + divisao);

        sc.close();
    }
}
