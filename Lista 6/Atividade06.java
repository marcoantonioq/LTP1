import java.util.Scanner;  // Import Scanner class

public class Atividade06 {
    
    public static void main (String arg []){
        
        Scanner Obj = new Scanner(System.in);
        
        int cod_peca1, num_peca1;
        int cod_peca2, num_peca2;
        
        double total, valor_peca1, valor_peca2;

        System.out.print("Informe o cod. peça1: ");
        cod_peca1 = Obj.nextInt();

        System.out.print("Informe o numero de peça1: ");
        num_peca1 = Obj.nextInt();

        System.out.print("Informe o valor da peça1: ");
        valor_peca1 = Obj.nextInt();

        System.out.print("Informe o cod. peça2: ");
        cod_peca2 = Obj.nextInt();

        System.out.print("Informe o numero de peça2: ");
        num_peca2 = Obj.nextInt();

        System.out.print("Informe o valor da peça2: ");
        valor_peca2 = Obj.nextInt();

        total = (num_peca1*valor_peca1)+(num_peca2*valor_peca2);

        System.out.println("Valor a ser pago: "+total);
    }
}
