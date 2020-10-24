package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade06 { // class
    public Atividade06(){ // constrututor
        
        Scanner input = new Scanner(System.in);
        
        int i;
        int A[] = new int[10];
        int maior=0, menor=0;
        
        for(i=0; i < A.length; i++){
            System.out.print("A: Informe valor"+(i+1)+": ");
            A[i] = input.nextInt();
            
            if(i==0 || A[i] > maior){
                maior = i;
            }
            
            if(i==0 || A[i] < menor){
                menor = i;
            }
        }
        System.out.println("O maior está na posição: "+(maior+1));       
        System.out.println("O menor está na posição: "+(menor+1));       
        
    }
}
