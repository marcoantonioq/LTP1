//https://www.devmedia.com.br/estatistica-descritiva-em-java/6160
package atividade;

import java.util.Arrays;
import java.util.Scanner;  // Import Scanner class

public class Atividade11 { // class
    public Atividade11(){ // constrututor
        
        Scanner input = new Scanner(System.in);
        
        double v[] = new double[10];
        double maior=0;
        
        // Lê vetor
        for(int i=0; i < v.length; i++){
            System.out.print("Informe valor"+(i+1)+": ");
            v[i] = input.nextDouble();
        }

        Arrays.sort(v);
        
        // Mostra
        System.out.println("Vetor final: ");
        
        for(int i=0; i < v.length; i++){
            System.out.println("V["+(i+1)+"] = "+ v[i]);
        }
            
        
    }
}