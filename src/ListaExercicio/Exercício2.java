package ListaExercicio;

import java.util.Scanner;

public class Exercício2 {
  /* Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência (base elevada ao
expoente). Dica: use a função matemática Math.pow(). Exemplo: 5 elevado ao cubo ficaria
Math.pow(5, 3) . Você pode trocar esses números por variáveis.
*/
    
    public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
        double  b1, e1, resultado;
        // Entrada
        System.out.println(" Exponenciação ");
        System.out.println (" Digite a base " );
        b1 = leitor.nextDouble();
        System.out.println (" Digite o expoente ");
        e1 = leitor.nextDouble();
        // Processamento
        resultado = Math.pow(b1, e1);
        //Saída
        System.out.println (" Resultado " + resultado);
        
    }
}
