import java.util.Scanner;
public class Matriz {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int soma = 0;
        int [][] matriz = new int[3][3];

        System.out.println("Preencha a matriz 3X3 ,Para calcular: ");
        for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            matriz[i][j] = sc.nextInt();
        }
    }
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }
        System.out.println("A Soma dos Elementos da Diagonal Principal " + soma );
    }
}