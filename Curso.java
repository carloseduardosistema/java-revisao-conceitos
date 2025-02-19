import java.util.Scanner;
public class Curso {
    // Este basic
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int soma2 = 0;
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        soma = C + D;
        soma2 = A + B;
        if (B > C && D > A && soma > soma2 && C >= 0 && D >= 0 && A % 2 == 0) {
                System.out.println("Valores aceitos");
        } else {
                System.out.println("Valores nao aceitos");
        }
        
        sc.close();
    }
}
