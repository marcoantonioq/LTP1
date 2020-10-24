//https://www.devmedia.com.br/estatistica-descritiva-em-java/6160
package atividade;

import java.lang.Math;
import java.util.Scanner;  // Import Scanner class

public class Atividade09 { // class
    public Atividade09(){ // constrututor
        
        Scanner input = new Scanner(System.in);
        
        int i;
        double v[] = new double[5];
        double soma=0,soma2=0, media=0, desvio=0;
        
        // Lê vetor
        for(i=0; i < v.length; i++){
            System.out.print("Informe valor"+(i+1)+": ");
            v[i] = input.nextDouble();
            soma += v[i];
            soma2 += Math.pow(v[i], 2);
        }

        Double tamanho = Double.valueOf(v.length - 1);
        double p1 = 1 / tamanho;
        double p2 = soma2 - (Math.pow(soma, 2)/tamanho);
        desvio = p1 * p2;

        System.out.println("Descio padrão: "+desvio);
        
    }
}
