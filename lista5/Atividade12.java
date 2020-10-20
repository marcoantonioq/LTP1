import java.util.Scanner;  // Import Scanner class

public class Atividade12 {

	public static void main (String arg []){

        double A;
        double B;

        Scanner Obj = new Scanner(System.in);
        
        System.out.println("Informe numero: ");
        double valor = Obj.nextDouble();

        // A)
        System.out.println("\nSe valor é > 0! ");
        if(valor > 0) {
            A = valor;
            System.out.println("A = " + valor);
        } else {
            B = valor;
            System.out.println("B = " + valor);
        }

        // B)
        System.out.println("\nSe valor é par! ");
        if(valor % 2 == 0) {
            A = valor;
            System.out.println("A = " + valor);
        } else {
            B = valor;
            System.out.println("B = " + valor);
        }
        
        // C)
        System.out.println("\nSe valor é > 100! ");
        if(valor > 100) {
            System.out.println("Valor = " + valor);
        } else {
            System.out.println("Valor = 0");
        }
        
        // D)
        System.out.print("Digite sexo (m=masculino ou f=feminino): ");
        String sexo = Obj.nextLine();
        // String sexo = "m";

        System.out.print("Digite sua altura: ");
        Double h = Obj.nextDouble();
        // Double h = 1.70;

        if(sexo == "m") {
            System.out.println("Seu peso ideal é: "+ ((72.7*h)-58) );
        } else {
            System.out.println("Seu peso ideal é: "+ ((62.1*h)-44.7) );
        }
        
        
	}
}
