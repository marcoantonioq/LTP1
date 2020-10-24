package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade08 { // class
    public Atividade08(){ // constrututor
        
        Scanner input = new Scanner(System.in);
        
        int i;
        double A[] = new double[5];
        double B[] = new double[5];
        double UV=0;
        
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

        // Imprimir vetor A
        for(i=0; i < A.length; i++){
            System.out.println("A["+(i+1)+"] = "+ A[i]);
        }
        // Imprimir vetor B
        for(i=0; i < B.length; i++){
            System.out.println("B["+(i+1)+"] = "+ B[i]);

            // Calcula o produto escalar
            UV += A[i] * B[i];            
        }

        System.out.println("Produto escalar é: "+UV);
        
    }
}
