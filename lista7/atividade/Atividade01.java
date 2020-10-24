package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade01 { // class
    public Atividade01(){ // constrututor

        Scanner Obj = new Scanner(System.in);

        int vetor[] = new int[10];
        int soma;

        
        System.out.print("Informe valor X: ");
        vetor[0] = Obj.nextInt();
        
        System.out.print("Informe valor Y: ");
        vetor[1] = Obj.nextInt();

        soma = vetor[0] + vetor[1];

        System.out.printf("Soma: %d", soma);

    }
}
