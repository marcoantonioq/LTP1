package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade18 { // class
    public Atividade18(){ // constrututor
        
        Scanner input = new Scanner(System.in);
        
        String pk1="Dabriel";
        double ataq1=2, def1=4, bonus1, valorgolpe1;
        
        String pk2="Guarte";
        double ataq2=3, def2=2, bonus2, valorgolpe2;
        
        
        System.out.println("Bonus Pokemon 1: ");
        bonus1 = input.nextDouble();
        
        System.out.println("Bonus Pokemon 2: ");
        bonus2 = input.nextDouble();
        
        valorgolpe1 = ((ataq1 + def1 )/2)+bonus1;
        valorgolpe2 = ((ataq2 + def2 )/2)+bonus2;
        
        System.out.println("");
        if(valorgolpe1 > valorgolpe2) {
            System.out.println("Pokemon 1 danhou!!!!!");
        } else {
            System.out.println("Pokemon 2 danhou!!!!!");
        }
        
        
        
        
        
        
    }
}
