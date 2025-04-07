package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class esExercicio7 {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int funcionario = sc.nextInt();
        double horaTrabalhada = sc.nextDouble();
        double valorPorhora = sc.nextDouble();

        double salario = horaTrabalhada * valorPorhora;

        System.out.println("Matricula do Funcionário: " + funcionario);
        System.out.printf("Salário = R$%.2f", salario);

        sc.close();
    }
}
