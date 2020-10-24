package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade05 { // class
    public Atividade05(){ // constrututor
        
        Scanner input = new Scanner(System.in);
        
        int i;
        int A[] = new int[10];
        int maior=0, menor=0;
        int x, soma=0, count=0;
        
        for(i=0; i < A.length; i++){
            System.out.print("A: Informe valor"+(i+1)+": ");
            A[i] = input.nextInt();
            
            if(i==0 || A[i] > maior){
                maior = A[i];
            }
            
            if(i==0 || A[i] < menor){
                menor = A[i];
            }
        }
        System.out.print("A: Informe valor de x: ");
        x = input.nextInt();

        for(i=0; i < A.length; i++){
            if(A[i] % x == 0){
                count++;
                soma += A[i];
            }
            
        }
        
        System.out.println("O maior número: "+maior);       
        System.out.println("O menor número: "+menor);       
        System.out.println("Quantidade de multiplos: "+count);       
        System.out.println("Soma: "+soma);       
        
    }
}
