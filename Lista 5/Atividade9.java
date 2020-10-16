import java.util.Scanner;  // Import Scanner class

public class Atividade9 {

	public static void main (String arg []){

        Scanner Obj = new Scanner(System.in);

        System.out.println("Nome = José");
        String nome = "José";

        System.out.println("Informe o sálario atual: ");
        double salario = Obj.nextDouble();

        System.out.println("Novo salario é (+15%): "+ (salario*1.15) );
	}
}
