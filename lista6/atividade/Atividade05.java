package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade05 { // class
    public Atividade05(){ // constrututor
        Scanner Obj = new Scanner(System.in);
        
        String nome_vendedor;

        double salario_fixo, total_vendas, salario;

        System.out.print("Informe nome: ");
        nome_vendedor = Obj.nextLine();

        System.out.print("Informe salário fixo: ");
        salario_fixo = Obj.nextDouble();

        System.out.print("Total de vendas: ");
        total_vendas = Obj.nextDouble();

        salario = salario_fixo + (total_vendas * 0.15);

        System.out.println("Salário total: "+salario);

    }
}
