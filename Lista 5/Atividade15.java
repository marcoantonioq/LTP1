import java.util.Scanner;  // Import Scanner class

public class Atividade15 {

	public static void main (String arg []){

        int n1=0;
        int n2=2;
        int n3;
        int n4;
        Scanner Obj = new Scanner(System.in);

        System.out.println("Numero 1: ");
        n1 = Obj.nextInt();
        System.out.println("Numero 2: ");
        n2 = Obj.nextInt();
        System.out.println("Numero 3: ");
        n3 = Obj.nextInt();
        System.out.println("Numero 4: ");
        n4 = Obj.nextInt();
        
        System.out.println("Quadrado de n1 é: " + n1 * 2);
        System.out.println("Quadrado de n2 é: " + n2 * 2);
        System.out.println("Quadrado de n3 é: " + n3 * 2);
        System.out.println("Quadrado de n4 é: " + n4 * 2);


	}
}
