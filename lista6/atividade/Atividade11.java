package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade11 { // class
    public Atividade11(){ // constrututor
        Scanner Obj = new Scanner(System.in);
        
        int idade;
        float mes, ano;
        
        System.out.print("Informe valor: ");
        idade = Obj.nextInt();
        
        mes = idade / 30; // Double.toString converte para string
        ano = idade / 365; 

        System.out.println("Mêses de vida: "+mes);
        System.out.println("Anos de vida: "+ano);

        
    }
}
