package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade07 { // class
    public Atividade07(){ // constrututor
        
        Scanner input = new Scanner(System.in);
        
        int i;
        int A[] = new int[10];
        int B[] = new int[10];
        int R[] = new int[10];
        int maior=0, menor=0;
        
        // Lê vetor A
        for(i=0; i < A.length; i++){
            System.out.print("A: Informe valor"+(i+1)+": ");
            A[i] = input.nextInt();
        }
        // Lê vetor B
        for(i=0; i < A.length; i++){
            System.out.print("A: Informe valor"+(i+1)+": ");
            B[i] = input.nextInt();
        }

        System.out.println("Vetor resultante: ");
        for(i=0; i < R.length; i++){
            if(A[i] % 2 == 0 ){
                R[i] = A[i];
            } else {
                R[i] = B[i];
            }
            // Mostra vetor R
            System.out.println("R["+(i+1)+"] = "+R[i]);       
        }
        
    }
}
