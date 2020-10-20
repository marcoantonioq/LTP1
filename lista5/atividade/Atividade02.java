package atividade;
import java.util.Scanner;

public class Atividade02 {
    
    public Atividade02(){

        Scanner Obj = new Scanner(System.in);
        
        System.out.print("Informe quantidade mínima");
        int mini = Obj.nextInt();
        
        System.out.print("Informe quantidade máxima: ");
        int max = Obj.nextInt();
        
        double media = ( mini + max ) / 2;
        
        System.out.println("Estoque médio: " + media);
    }
}
