package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ecExercicio4 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if(x >= 0){
            System.out.println("Não negativo");
        }
        else {
            System.out.println("Negativo");
        }

        sc.close();
    }
}
