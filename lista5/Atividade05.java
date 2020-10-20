package lista5;
import java.util.Scanner;

public class Atividade05 {
    
    public Atividade05(){

        System.out.println("\n\nAtividade 05");

        Scanner Obj = new Scanner(System.in);

        System.out.print("Digite valor para n1: ");
        double n1 = Obj.nextDouble();

        System.out.print("Digite valor para n2: ");
        double n2 = Obj.nextDouble();

        System.out.print("Digite valor para n3: ");
        double n3 = Obj.nextDouble();

        System.out.print("Digite valor para n4: ");
        double n4 = Obj.nextDouble();

        System.out.println("Quadrado de N1 é: "+ n1*2);
        System.out.println("Quadrado de N2 é: "+ n2*2);
        System.out.println("Quadrado de N3 é: "+ n3*2);
        System.out.println("Quadrado de N4 é: "+ n4*2);

        double soma = (n1+n2+n3+n4);
        System.out.println("Soma de todos os valores é " + soma );
	}
}
