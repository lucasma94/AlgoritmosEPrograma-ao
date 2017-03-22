package ListaExercicio;

import java.util.Scanner;

public class Exercício1 {

    // Fazer um algoritmo que leia dois números e imprima na tela o produto (multiplicação) dos dois números.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n1, n2, resultado;
        System.out.println(" Fazer um algoritmo que leia dois números e imprima \n na tela o produto (multiplicação) dos dois números. ");
        System.out.println(" Digite n1 ");
        n1 = leitor.nextInt();
        System.out.println (" Digite n2 ");
        n2 = leitor.nextInt();
        resultado = n1*n2;
        System.out.println(" Resultado " + resultado);
        
    }

}
