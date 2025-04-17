package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ecExercicio5 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if(x % 2 == 0){
            System.out.println("Par");
        }
        else {
            System.out.println("Impar");
        }

        sc.close();
    }
}