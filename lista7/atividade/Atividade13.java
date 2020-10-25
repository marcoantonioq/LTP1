//https://www.devmedia.com.br/estatistica-descritiva-em-java/6160
package atividade;

import java.util.Scanner;  // Import Scanner class
import java.util.List;
import java.util.Arrays;

public class Atividade13 { // class
    public Atividade13(){ // constrututor
        
        Scanner input = new Scanner(System.in);
        
        double v[] = new double[10];
        
        // Lê vetor
        for(int i=0; i < v.length; i++){
            System.out.print("Informe valor"+(i+1)+": ");
            v[i] = input.nextDouble();
            
            for(int x=i-1; x >= 0; x--){
                if(v[i] == v[x]){
                    System.out.println("Opa: valor "+v[i]+" existente na posição "+(x+1));
                }
            }
            
        }
    }
}