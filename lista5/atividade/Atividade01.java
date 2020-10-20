package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade01 { // class
    public Atividade01(){ // constrututor

        Scanner Obj = new Scanner(System.in);
        
        System.out.print("Informe o codigo da peça: ");
        String cod_peca = Obj.nextLine();
        
        System.out.print("Informe o valor da peça: ");
        double valor_peca = Obj.nextDouble();
        
        System.out.print("Informe a quantidade da peça: ");
        int qt_peca = Obj.nextInt();
        
        System.out.println("Codigo informado: "+cod_peca);
        System.out.println("Valor total: "+ (valor_peca * qt_peca ) );
        
    }
}
