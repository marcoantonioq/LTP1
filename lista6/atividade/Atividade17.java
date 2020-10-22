package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade17 { // class
    public Atividade17(){ // constrututor
        
        Scanner input = new Scanner(System.in);
        
        int i;
        double termos, S=0;
        
        System.out.println("Informe a quantidade de termos: ");
        termos = input.nextInt();
        
        for(i=0; i < termos; i++){
            if(i%2 == 0){
                S = S + 1; 
            } else {
                S = S - 1; 
            }
        }
        System.out.println("S = " + S);
    }
}
