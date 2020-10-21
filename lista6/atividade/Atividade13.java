package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade13 { // class
    public Atividade13(){ // constrututor

        Scanner input = new Scanner(System.in);

        int valor;

        System.out.println("Informe um valor: ");
        // valor = input.nextInt();
        valor=20;

        System.out.print(valor+" ");

        if(valor > 0 && valor < 25){
            System.out.println("Está entre 0 e 25");
        } else if(valor >= 25 && valor < 50) {
            System.out.println("Está entre 25 e 50");
        } else if(valor >= 50 && valor < 75) {
            System.out.println("Está entre 50 e 75");
        } else if(valor >= 75 && valor < 100) {
            System.out.println("Está entre 75 e 100");
        }

    }
}
