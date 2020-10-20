import java.util.Scanner;  // Import Scanner class

public class Atividade6 {

	public static void main (String arg []){

        Scanner Obj = new Scanner(System.in);

        System.out.print("Digite identificardo do vendedor: ");
        int id_vendedor = Obj.nextInt();

        System.out.print("Digite codigo peça: ");
        int cod_peca = Obj.nextInt();

        System.out.print("Digite preço unitário da peça: ");
        double preco = Obj.nextDouble();

        System.out.print("Quantidade vendida: ");
        int qt = Obj.nextInt();

        double comissao = preco * qt;

        System.out.println("A comissão será de: " + comissao );


	}
}
