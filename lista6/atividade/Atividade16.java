package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade16 { // class
    public Atividade16(){ // constrututor
        
        Scanner input = new Scanner(System.in);
        
        double X,Y;
        
        System.out.print("Digite o pornto x: ");
        X = input.nextInt();
        
        System.out.print("Digite o pornto y: ");
        Y = input.nextInt();
        
        if( X > 0 && Y > 0){
            System.out.println("1° Quadrante");
        }
        if(Y>0 && X < 0){
            System.out.println("2º Quadrante");
        }
        if( X < 0 && Y < 0){
            System.out.println("3° Quadrante");
        }
        if(Y < 0 && X > 0){
            System.out.println("4º Quadrante");
        }
        
    }
}
