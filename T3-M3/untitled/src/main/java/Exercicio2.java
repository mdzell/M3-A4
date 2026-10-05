import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu sexo (F/M): ");
        String sexo = scanner.nextLine();

        System.out.print("Digite seu estado civil: ");
        String estadoCivil = scanner.nextLine();

        if (sexo.equalsIgnoreCase("F")
                && estadoCivil.equalsIgnoreCase("CASADA")) {
            System.out.print("Há quantos anos está casada? ");
            int anosCasada = scanner.nextInt();

            System.out.println(nome + " está casada há "
                    + anosCasada + " anos.");
        }

        scanner.close();
    }
}