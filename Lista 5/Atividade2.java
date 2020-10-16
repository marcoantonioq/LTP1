
import java.util.Scanner;  // Import Scanner class

public class Atividade2 {

	public static void main (String arg []){

        Scanner Obj = new Scanner(System.in);

        System.out.println("Informe quantidade mínima");
        int mini = Obj.nextInt();

        System.out.println("Informe quantidade máxima: ");
        int max = Obj.nextInt();

        double media = ( mini + max ) / 2;

        System.out.println("Estoque médio: " + media);
	}
}
