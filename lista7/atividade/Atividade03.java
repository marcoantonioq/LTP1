package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade03 { // class
    public Atividade03(){ // constrututor
        
        Scanner input = new Scanner(System.in);
        
        int i;
        int A[] = new int[10];
        int B[] = new int[10];
        int C[] = new int[10];
        
        // A
        for(i=0; i < A.length; i++){
            System.out.print("A: Informe valor"+(i+1)+": ");
            A[i] = input.nextInt();
        }
        
        // B
        for(i=0; i < B.length; i++){
            System.out.print("B: Informe valor"+(i+1)+": ");
            B[i] = input.nextInt();
        }
        
        // C
        for(i=0; i < C.length; i++){
            C[i] = A[i] - B[i];
        }
        for(i=0; i < C.length; i++){
            System.out.println("C: ["+(i+1)+"] é: "+C[i]);
        }
        
    }
}
