package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade15 { // class
    public Atividade15(){ // constrututor
        
        Scanner input = new Scanner(System.in);
        
        int ano;
        
        System.out.print("Digite ano: ");
        ano = input.nextInt();
        
        if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
            System.out.print(ano + " é um ano bissexto!!!");
        } else {
            System.out.print(ano + " não é um ano bissexto!!!");
        }
        
    }
}
