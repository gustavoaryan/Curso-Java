package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class erExercicio2 {
    public static void main(String[] ags){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while(senha != 1998){
            System.out.println("Senha invalida");
            senha = sc.nextInt();

        }
        System.out.println("Acesso permitido");
        sc.close();
    }
}
