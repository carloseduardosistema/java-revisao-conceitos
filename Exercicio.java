import java.util.Scanner;
public class Exercicio {
    public static void main(String[] args){
        // Soma de arrays.
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int [] numero = new int [5];

        System.out.println("Digite os cincos numero , enseridos no array , para calcular sua soma total: ");

        for (int i = 0; i < numero.length; i++) {
            numero[i] = sc.nextInt();
        }
        for (int i = 0; i < numero.length; i++) {
            soma += numero[i];
        }

        System.out.println("A Soma total é "+ soma);
    }
}
