package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ecExercicio11 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

       /*if (salario <= 2000.00){
            System.out.println("Isento");
        } else if (salario > 2000.01 && salario <= 3000.00) {
            double taxa = salario * 1.8;
            System.out.println(taxa);
        } else if (salario > 3000.01 && salario <= 4500.00) {
            double taxa = salario * 1.18;
            System.out.println(taxa);
        }else {
            double taxa = salario * 1.28;
            System.out.println(taxa);
        }*/

        double imposto;
        if (salario <= 2000.0) {
            imposto = 0.0;
        }
        else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
    }
}
