package exercicios;

import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class pooExercicio1 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rec = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        System.out.print("Width: ");
        rec.width = sc.nextDouble();
        System.out.print("Height: ");
        rec.height = sc.nextDouble();
        
        System.out.printf("Area = %.2f%n", rec.area());
        System.out.printf("Perimeter = %.2f%n", rec.perimeter());
        System.out.printf("Diagonal = %.2f%n", rec.diagonal());
        sc.close();
    }
}