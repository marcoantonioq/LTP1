package atividade;

public class Atividade17 { // class
    public Atividade17(){ // constrututor
        
        int[][] A={{1,2},{3,4},{5,6}};
        int[][] B={{1,2},{3,4},{5,6}};
        int[][] C=new int [3][2];
        
        System.out.println("// Resultado");
        for (int i = 0; i < 3; i++) { // linha
            for (int j = 0; j < 2; j++) { // coluna
                C[i][j] = A[i][j] + B[i][j];
                System.out.println("C["+i+"][" +j+ "] =" + C[i][j]);
            }
        }

        System.out.println("// Resultado em matriz");
        for (int i = 0; i < 3; i++) { // linha
            for (int j = 0; j < 2; j++) { // coluna
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}