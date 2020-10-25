//https://www.devmedia.com.br/estatistica-descritiva-em-java/6160
package atividade;

import java.util.Scanner;  // Import Scanner class
import java.util.List;
import java.util.Arrays;

public class Atividade14 { // class
    public Atividade14(){ // constrututor
        
        Scanner input = new Scanner(System.in);
        
        double v[] = new double[10];
        
        // Lê vetor
        int i=0;
        while(i < v.length){
            boolean rep=false;
            System.out.print("Informe valor"+(i+1)+": ");
            double tmp = input.nextDouble();
            
            for(int x=i-1; x >= 0; x--){
                if(tmp == v[x]){
                    rep = true;
                    break;
                }
            }
            if(rep) {
                continue;
            } else {
                v[i] = tmp;
                i++;
            }
        }
        for(int t=0; t < v.length; t++){
            System.out.println("V["+(t+1)+"] = "+v[t]);
        }
    }
}