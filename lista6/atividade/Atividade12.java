//https://www.youtube.com/watch?v=k_g_QVDrjXE
package atividade;


import java.util.Scanner;  // Import Scanner class
import java.lang.Math;

public class Atividade12 { // class
    public Atividade12(){ // constrututor
        Scanner Obj = new Scanner(System.in);
        
        float a=20, b=300, c=4; // valor de teste
        double delta, x1, x2;
        
        System.out.print("Informe valor de A: ");
        a = Obj.nextFloat();
        
        System.out.print("Informe valor de B: ");
        b = Obj.nextFloat();
        
        System.out.print("Informe valor de C: ");
        c = Obj.nextFloat();
        
        delta = Math.pow(b,2) - (4*a*c);
        
        if(delta > 0) {
            x1 = (-b + Math.pow(delta, (1/2)) ) / (2*a);
            x2 = (-b - Math.pow(delta, (1/2)) ) / (2*a);
            System.out.println("A equação possui 2 raizes reais.");
            System.out.println("X1: "+x1);
            System.out.println("X2: "+x2);
        } else {
            if(delta > 0) {
                System.out.println("A equação possui uma raiz.");
                x1 = -b / (2*a);
                System.out.println("X1: "+x1);
            }else{
                System.out.println("Impossível calcular");
            }
        }
        
        System.out.println("Resultado: "+delta);
        
    }
}
