package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade03 { // class
    public Atividade03(){ // constrututor
        Scanner Obj = new Scanner(System.in);
        
        double A, B, C, D, DIFERENCA;
        
        System.out.print("\nDigite A: ");
        A = Obj.nextDouble();
        
        System.out.print("\nDigite B: ");
        B = Obj.nextDouble();
        
        System.out.print("\nDigite C: ");
        C = Obj.nextDouble();
        
        System.out.print("\nDigite D: ");
        D = Obj.nextDouble();
        
        DIFERENCA =( A * B - C * D );
        
        System.out.println("DIFERENÇA = " + DIFERENCA );
    }
}
