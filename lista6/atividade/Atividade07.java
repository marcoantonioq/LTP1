package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade07 { // class
    public Atividade07(){ // constrututor
        Scanner Obj = new Scanner(System.in);

        int A, B, C;
        double resultado;

        System.out.print("Digite valor de A: ");
        A = Obj.nextInt();

        System.out.print("Digite valor de B: ");
        B = Obj.nextInt();

        System.out.print("Digite valor de C: ");
        C = Obj.nextInt();

        // A
        resultado= (C*2)/2;
        System.out.println("Área do triângulo retângulo: "+resultado);
        // B
        resultado= 3.14159 * (C*2);
        System.out.println("Área do triângulo: "+resultado);
        // C
        resultado= (A+B)*C;
        System.out.println("área do trapézio: "+resultado);
        // D
        // resultado= 3.14159 * (C*2);
        System.out.println("área do quadrado: "+resultado);
        // E
        resultado= (A*B)/2;
        System.out.println("área do retângulo: "+resultado);
        
    }
}
