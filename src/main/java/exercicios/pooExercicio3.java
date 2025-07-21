package exercicios;

import entities.Students;

import java.util.Locale;
import java.util.Scanner;

public class pooExercicio3 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Students students = new Students();

        students.name = sc.nextLine();
        students.grade1 = sc.nextDouble();
        students.grade2 = sc.nextDouble();
        students.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", students.finalGrade());

        if (students.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", students.missingPoints());
        }else {
            System.out.println("PASS");
        }

        sc.close();
    }
}
