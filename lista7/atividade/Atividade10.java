//https://www.devmedia.com.br/estatistica-descritiva-em-java/6160
package atividade;

import java.lang.Math;
import java.util.Scanner;  // Import Scanner class

public class Atividade10 { // class
    public Atividade10(){ // constrututor
        
        Scanner input = new Scanner(System.in);
        
        int i, t;
        double aux;
        double v[] = new double[15];
        double soma=0,soma2=0, media=0, desvio=0;
        
        // Lê vetor
        for(i=0; i < v.length; i++){
            System.out.print("Informe valor"+(i+1)+": ");
            v[i] = input.nextDouble();
        }

        // compacta
        for(i=0; i < v.length; i++){
            if(v[i] == 0 ){
                for(t=i; t < v.length-1; t++){
                    v[t] = v[t+1];
                    v[t+1] = 0;
                }
            }
        }
        
        // Mostra
        System.out.println("Vetor resultante: ");       
        for(i=0; i < v.length; i++){
            System.out.println("V["+(i+1)+"] = "+ v[i]);
        }
        
        
    }
}
