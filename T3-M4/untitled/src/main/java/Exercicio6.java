import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            numero = numero + 5;
        } else {
            numero = numero + 8;
        }

        System.out.println("Resultado: " + numero);

        scanner.close();
    }
}