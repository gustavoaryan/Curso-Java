package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ecExercicio8 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int unidade = sc.nextInt();

        double preco;

        if(codigo == 1){
            preco = unidade * 4.00;
        } else if (codigo == 2) {
            preco = unidade * 4.50;
        } else if (codigo == 3) {
            preco = unidade * 5.00;
        } else if (codigo == 4) {
            preco = unidade * 2.00;
        } else {
            preco = unidade * 1.50;

        }
        System.out.printf("Total: R$%.2f%n", preco);

        sc.close();
    }
}