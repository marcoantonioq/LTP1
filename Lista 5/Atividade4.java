import java.util.Scanner;  // Import Scanner class

public class Atividade4 {

	public static void main (String arg []){

        Scanner Obj = new Scanner(System.in);

        System.out.println("Informe cotação dolar atual: ");
        double cotacao_dolar = Obj.nextDouble();

        System.out.println("Informe valor em dolar: ");
        double dolar = Obj.nextDouble();

        double valor = cotacao_dolar * dolar;

        System.out.println("O valor $"+ dolar +" corresponde R$" + valor);
	}
}
