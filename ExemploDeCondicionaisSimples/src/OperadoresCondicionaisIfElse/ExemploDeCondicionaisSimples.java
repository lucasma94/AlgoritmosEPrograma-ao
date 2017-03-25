package OperadoresCondicionaisIfElse;

import java.util.Scanner;

public class ExemploDeCondicionaisSimples {
    public static void main(String args []){
        Scanner leitor = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("n1: ");
        n1 = leitor.nextInt();
        System.out.println("n2: ");
        n2 = leitor.nextInt();
        System.out.println("n3: ");
        n3 = leitor.nextInt();
        if ((n1 > n2) && (n1 > n3)) {
        System.out.printf("O número %d é o MAIOR \n", n1);
        }else if ((n2 > n3) && (n2 > n1)) {
                System.out.printf("O número %d é o MAIOR \n", n2);
                }else{
            System.out.printf("O número %d é o MAIOR \n", n3);
        }
                
        
    }
            
    
}
