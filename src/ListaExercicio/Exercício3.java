/*
  Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos dois números. O
quadrado de um número A é representado por A2
 = A * A.
 */
package ListaExercicio;

import java.util.Scanner;

public class Exercício3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double A1, A2, resultado;
        // Entrada
        System.out.println(" Fazer um algoritmo que lê dois números e imprime a \n"
                + "soma dos quadrados dos dois números. O quadrado de \n"
                + "um número A é representado por A2 = A * A. ");
        System.out.println(" ");
        System.out.print(" Digite número 1: ");
        A1 = leitor.nextDouble();
        System.out.print(" Digite número 2: ");
        A2 = leitor.nextDouble();
        // Processamento
        A1 = Math.pow(A1,2);
        A2 = Math.pow(A2,2);
        resultado = A1+ A2;
        // Saída
        System.out.println (" A soma dos números é: " + resultado);
    }

}
