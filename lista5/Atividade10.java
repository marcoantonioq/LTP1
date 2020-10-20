import java.util.Scanner;  // Import Scanner class

public class Atividade10 {

	public static void main (String arg []){

        int A = 3;
        int B = 7;
        int C = 4;

        // A)
        System.out.print("(A+C) > B é: ");
        if( ( A + C ) > B ) {
            System.out.println("V");
        } else {
            System.out.println("F");
        }

        // B)
        System.out.print("\nB >= (A + 2) é: ");
        if( B >= (A + 2) ) {
            System.out.println("V");
        } else {
            System.out.println("F");
        }

        // C)
        System.out.print("\nC = (B - A) é: ");
        if( C == (B - A) ) {
            System.out.println("V");
        } else {
            System.out.println("F");
        }

        // D)
        System.out.print("\n(B + A) <= C é: ");
        if(  (B + A) <= C ) {
            System.out.println("V");
        } else {
            System.out.println("F");
        }

        // E)
        System.out.print("\n(C+A) > B é: ");
        if( (C+A) > B ) {
            System.out.println("V");
        } else {
            System.out.println("F");
        }
	}
}
