import java.util.Scanner;  // Import Scanner class

public class Atividade13 {

	public static void main (String arg []){

        double peso_peixes;
        String E;
        double M=0;

        Scanner Obj = new Scanner(System.in);

        System.out.print("Informe peso peixe: ");
        peso_peixes = Obj.nextDouble();

        if(peso_peixes > 50) {
            E = "Excesso";
            M += 4; // multa de R$4
        } else {
            E = "0";
            M = 0;
        }
        System.out.println("E = " + E + " M = " + M);
	}
}
