package InputOutput;

import java.util.Scanner;

public class InformacoesPessoais {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Insisra sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Insisra o nome da sua cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Insira sua profissão: ");
        String profissao = scanner.nextLine();

        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Idade: %d%n", idade);
        System.out.printf("Cidade: %s%n", cidade);
        System.out.printf("Profissão: %s%n", profissao);

        scanner.close();

    }
}