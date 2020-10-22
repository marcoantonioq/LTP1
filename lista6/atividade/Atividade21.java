package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade21 { // class
    public Atividade21(){ // constrututor
        
        Scanner input = new Scanner(System.in);
        
        int X, Y, i, resultado=0;
        int N;
        
        //####
        System.out.println("A)");
        System.out.println("Informe valor de X: ");
        X = input.nextInt();
        System.out.println("Informe valor de Y: ");
        Y = input.nextInt();
        for(i=X; i<Y; i++ ) {
            if(i % 13 == 0){
                resultado += i;
            }
        }
        System.out.println("Sama múltiplos de 13 é:" + resultado);
        
        //####
        System.out.println("B)");
        System.out.println("Informe valor de N: ");
        N = input.nextInt();
        for(i=1; i<=10000; i++ ) {
            if(i % N == 0){
                resultado += i;
            }
        }
        System.out.println("Sama múltiplos de "+N+" entre 1 e 10000 é: " + resultado);
        
        //####
        System.out.println("C)");
        System.out.println("Informe valor de N: ");
        N = input.nextInt();
        for(i=1; i<=10000; i++ ) {
            if(i % N == 0){
                resultado += i;
            }
        }
        System.out.println("Sama múltiplos de "+N+" entre 1 e 10000 é: " + resultado);
        
        //####
        System.out.println("D)");
        for(i=0; i<100; i++ ) {
            System.out.println("Informe valor de N: ");
            N = input.nextInt();
            if( i==0 || N > resultado){
                resultado = N;
                X = i; // posição
            }
        }
        System.out.println("Maior valor encontrado foi "+resultado+" na posição "+X);
        
        //####
        System.out.println("E)");
        System.out.println("Informe valor de N: ");
        N = input.nextInt();
        for(i=0; i<=N; i++ ) {
            if(i % N == 0){
                System.out.println(i+" é divisor de "+N);
            }
        }
    }
}
