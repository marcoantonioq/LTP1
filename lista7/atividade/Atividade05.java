package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade05 { // class
    public Atividade05(){ // constrututor
        
        Scanner input = new Scanner(System.in);
        
        int i;
        int A[] = new int[10];
        int count_maiores_zero=0, count_menores_zero=0, maior=0, menor=0, count=0;
        
        for(i=0; i < A.length; i++){
            System.out.print("A: Informe valor"+(i+1)+": ");
            A[i] = input.nextInt();

            if(A[i] == 0){
                break;
            }

            count++;
            
            // A)
            if(A[i] > count_maiores_zero){
                count_maiores_zero++;
            }

            // B)
            if(A[i] > count_menores_zero){
                count_menores_zero++;
            }

            // C)
            if(i==0 || A[i] > maior){
                maior = A[i];
            }

            // D)
            if(i==0 || A[i] < menor){
                menor = A[i];
            }
        }
        
        System.out.println("a) a quantidade de números maiores que zero: "+count_maiores_zero);       
        System.out.println("b) a quantidade de números menores que zero: "+count_menores_zero);       
        System.out.println("c) o maior número: "+maior);       
        System.out.println("d) o menor número: "+menor);       

        System.out.println("e) todos os números em ordem inversa da entrada: ");       
        for(i=count;i>=0; i--){
            System.out.print(A[i]+"; ");       
        }
        
    }
}
