package lista5;
import java.util.Scanner;

public class Atividade02 {
    
    public Atividade02(){

        System.out.println("\n\nAtividade 02");
        
        Scanner Obj = new Scanner(System.in);
        
        System.out.print("Informe quantidade mínima");
        int mini = Obj.nextInt();
        
        System.out.print("Informe quantidade máxima: ");
        int max = Obj.nextInt();
        
        double media = ( mini + max ) / 2;
        
        System.out.println("Estoque médio: " + media);
    }
}
