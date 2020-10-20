
package lista5;
import java.util.Scanner;

public class Atividade13 {
    
    public Atividade13(){

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
