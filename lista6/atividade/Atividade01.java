package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade01 { // class
    public Atividade01(){ // constrututor
        
        double valor_raio;
        double area;
        Scanner Obj = new Scanner(System.in);
        
        System.out.print("Valor do raio: ");
        valor_raio = Obj.nextDouble();
        
        area = 4.13159 * (valor_raio * 2);
        
        System.out.println("Área: "+area);
    }
}
