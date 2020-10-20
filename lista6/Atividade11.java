import java.util.Scanner;  // Import Scanner class

public class Atividade11 {
    
    public static void main (String arg []){
        
        Scanner Obj = new Scanner(System.in);
        
        int segundo=5123;
        float hh, mm, ss;
        String time;
        
        // System.out.print("Informe valor: ");
        // segundo = Obj.nextInt();
        
        hh = segundo / 3600; // Double.toString converte para string
        mm = (segundo - (hh *3600))/ 60; 
        ss = segundo % 60 ; 
        
        time = String.format("Time: %.0f:%.0f:%.0f", hh,mm,ss);

        System.out.println(time);

        
    }
}
