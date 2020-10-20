package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade08 { // class
    public Atividade08(){ // constrututor
        Scanner Obj = new Scanner(System.in);

        double consumo, distancia, combustivel;

        System.out.print("Informe a distancia: ");
        distancia = Obj.nextDouble();

        System.out.print("Informe combustivel: ");
        combustivel = Obj.nextDouble();

        consumo = distancia / combustivel;
        System.out.print("Consumo: "+consumo);
    }
}
