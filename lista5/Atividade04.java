package lista5;
import java.util.Scanner;

public class Atividade04 {
    
    public Atividade04(){

        System.out.println("\n\nAtividade 04");
        
        Scanner Obj = new Scanner(System.in);
        
        System.out.print("Informe cotação dolar atual: ");
        double cotacao_dolar = Obj.nextDouble();
        
        System.out.print("Informe valor em dolar: ");
        double dolar = Obj.nextDouble();
        
        double valor = cotacao_dolar * dolar;
        
        System.out.println("O valor $"+ dolar +" corresponde R$" + valor);
    }
}
