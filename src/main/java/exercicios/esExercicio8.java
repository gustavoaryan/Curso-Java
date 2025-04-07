package exercicios;


import java.util.Locale;
import java.util.Scanner;

public class esExercicio8 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int codigo1 = sc.nextInt();
        int quantidade1 = sc.nextInt();
        double preco1 = sc.nextDouble();

        int codigo2 = sc.nextInt();
        int quantidade2 = sc.nextInt();
        double preco2 = sc.nextDouble();

        double peca1 = quantidade1 * preco1;
        double peca2 = quantidade2 * preco2;
        double valorAPagar = peca1 + peca2;

        System.out.printf("Valor a pagar: R$ %.2f%n", valorAPagar);

        sc.close();
    }
}
