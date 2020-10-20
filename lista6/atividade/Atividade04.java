package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade04 { // class
    public Atividade04(){ // constrututor
        Scanner Obj = new Scanner(System.in);
        
        int num_funcionario, num_horas;
        double valor_hora, salario;
        
        System.out.print("\nDigite número do funcionário: ");
        num_funcionario = Obj.nextInt();
        
        System.out.print("\nDigite número de horas trabalhada: ");
        num_horas = Obj.nextInt();
        
        System.out.print("\nValor horas trabalhadas: ");
        valor_hora = Obj.nextDouble();

        salario = (num_horas * valor_hora);


        System.out.println("Salário: R$" + salario );
    }
}
