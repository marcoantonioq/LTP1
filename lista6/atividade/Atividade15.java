package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade15 { // class
    public Atividade15(){ // constrututor
        
        Scanner input = new Scanner(System.in);
        
        double A,B,C;
        
        System.out.print("Informa lado A: ");
        A = input.nextDouble();
        
        System.out.print("Informa lado B: ");
        B = input.nextDouble();
        
        System.out.print("Informa lado C: ");
        C = input.nextDouble();
        
        if(A == 0 || B == 0 || C == 0){
            System.out.println("Valores não pode ser 0");
        } else {
            if(C > A + B || A > B + C || B > A + C) {
                System.out.println("Perimetro = " + (A+B+C));
            } else {
                System.out.println("Não é um triangulo");
                System.out.println("Área do trapézio: " + ((C+B)/2)*A );
            }
        }
        
    }
}
