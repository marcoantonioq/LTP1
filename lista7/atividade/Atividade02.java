package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade02 { // class
    public Atividade02(){ // constrututor
        
        Scanner input = new Scanner(System.in);
        
        int i;
        int vetor[] = new int[10];
        
        for(i=0; i < vetor.length; i++){
            System.out.print("Informe valor"+(i+1)+": ");
            vetor[i] = input.nextInt();
        }

        for(i=0; i < vetor.length; i++){
            System.out.println("Valor "+(i+1)+" é: "+vetor[i]);
        }
        
    }
}
