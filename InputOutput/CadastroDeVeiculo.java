package InputOutput;

import java.util.Scanner;

public class CadastroDeVeiculo {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do proprietario do carro: ");
        String name = scanner.nextLine();

        System.out.print("Modelo do carro: ");
        String model = scanner.nextLine();

        System.out.print("Ano do Carro: ");
        int year = scanner.nextInt();

        System.out.print("Quilometragem do Carro: ");
        int odometer = scanner.nextInt();

        System.out.printf("Proprietario: %s%n", name);
        System.out.printf("Modelo: %s%n", model);
        System.out.printf("Ano: %d%n", year);
        System.out.printf("Quilometragem: %d%n", odometer);

        scanner.close();
    }
}
