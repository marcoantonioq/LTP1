package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade02 { // class
    public Atividade02(){ // constrututor
        
        Scanner Obj = new Scanner(System.in);
        
        double A, B, media;
        
        System.out.print("\nDigite nota A: ");
        A = Obj.nextDouble();
        
        System.out.print("\nDigite nota B: ");
        B = Obj.nextDouble();
        
        media =( ((A*3.5) + (B*7.5) ) / ( 3.5 + 7.4 ) );
        
        System.out.println("Media ponderada: " + media );
    }
}
