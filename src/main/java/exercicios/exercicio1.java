package exercicios;

import java.util.Locale;

public class exercicio1 {
    public static void main(String[] args){
        System.out.print("Good moorning!");
        System.out.println("Hello World!");

        int x = 8;
        double y = 10.57483;
        double w = 10.57483;
        System.out.println(x);
        System.out.println(y);
        System.out.printf("%.2f%n", w);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", w);

        System.out.printf("Resultado = " + x + " Metros%n");

        String nome = "Gustavo";
        int idade = 26;
        double salario = 1325.0;
        String dev = "Java";
        double fsalario = 4000;
        String main = "Jesus";
        System.out.printf("Meu nome é %s e tenho %d anos, atualmente o meu salário é R$ %.2f reais%n. Mas quando me torna dev Back-end com a linguagem %s, vou ter um salário de +R$%.2f reais%n para a honrar e glória de %s.", nome, idade, salario, dev, fsalario, main);


    }
}
