package InputOutput;

import java.util.Scanner;

public class CadastroSimples {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Insira sua idade: ");
        int idade = scanner.nextInt();

        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Idade: %d%n", idade);

        scanner.close();
    }
}