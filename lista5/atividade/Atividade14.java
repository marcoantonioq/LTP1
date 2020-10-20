
package atividade;
import java.util.Scanner;

public class Atividade14 {
    
    public Atividade14(){
        int C;
        double N; 
        double E;
        double hora=10;
        double excedente=20;
        double salario_total=0;

        Scanner Obj = new Scanner(System.in);

        System.out.print("Código: ");
        C = Obj.nextInt();

        System.out.print("Horas trabalhadas: ");
        N = Obj.nextDouble();

        if(N > 50) {
            E=N-50;
            salario_total= (E * excedente) + (50 * hora);
        } else {
            E=0;
            salario_total= N * hora;
        }

        System.out.println("Salario a receber: " + salario_total);

	}
}
