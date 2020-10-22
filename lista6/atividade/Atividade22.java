package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade22 { // class
    public Atividade22(){ // constrututor
        
        Scanner input = new Scanner(System.in);
        
        int n;

        System.out.print("Informe o valor de n: ");
        n = input.nextInt();

        System.out.printf(n+" em hexadecimal: %x", n);
        
    }
}
