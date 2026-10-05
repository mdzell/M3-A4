import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("Dobro: " + (numero * 2));
        } else if (numero < 0) {
            System.out.println("Triplo: " + (numero * 3));
        } else {
            System.out.println("O número é zero.");
        }

        scanner.close();
    }
}