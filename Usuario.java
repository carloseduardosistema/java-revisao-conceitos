import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {   
  
        // Subcompleto
        int numero1 = 15;
        int numero2 = 10;
        int modulo = 10;

        Calculadora calculadora = new Calculadora();

        System.out.println("O Resultado: ");
        System.out.println("Soma: " + calculadora.somar(numero1, numero2));
        System.out.println("Subtracao: " + calculadora.subtrair(numero1 , numero2));
        System.out.println("Multiplicacao: " + calculadora.multiplicacao(numero1, numero2));
        System.out.println("Diviasao: "+ calculadora.divisao(numero1,numero2));
        System.out.println("Modulo: " + calculadora.modulo(numero1 , numero2));
    }
}
