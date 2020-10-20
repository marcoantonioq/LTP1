import java.util.Scanner;  // Import Scanner class

public class Atividade11 {

	public static void main (String arg []){

        int A = 5;
        int B = 4;
        int C = 3;
        int D = 6;

        // A)
        System.out.print("( A > C ) && ( C <= D ) é: ");
        if( ( A > C ) && ( C <= D ) ) {
            System.out.println("V");
        } else {
            System.out.println("F");
        }

        // B)
        System.out.print("\n(A+B) > 10 OR (A+B) = (C+D) é: ");
        if( ( A + B ) > 10 ||  ( A + B ) == ( C + D ) ) {
            System.out.println("V");
        } else {
            System.out.println("F");
        }

        // C)
        System.out.print("\n(A>=C) AND (D >= C) é: ");
        if( A >= C && D >= C ) {
            System.out.println("V");
        } else {
            System.out.println("F");
        }
	}
}
