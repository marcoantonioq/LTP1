package lista5;
import java.util.Scanner;

public class Atividade08 {
    
    public Atividade08(){
        Scanner Obj = new Scanner(System.in);
        
        System.out.println("Nome = José");
        String nome = "José";
        
        System.out.print("Informe o sálario atual: ");
        double salario = Obj.nextDouble();
        
        System.out.println("Novo salario é (+15%): "+ (salario*1.15) );
    }
}
