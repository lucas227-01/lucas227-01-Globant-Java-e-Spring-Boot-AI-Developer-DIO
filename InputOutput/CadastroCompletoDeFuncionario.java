package InputOutput;

import java.util.Scanner;

public class CadastroCompletoDeFuncionario {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do funcionario: ");
        String name = scanner.nextLine();

        System.out.print("Cargo do funcionario: ");
        String jobTitle = scanner.nextLine();

        System.out.print("Nome da cidade:");
        String cityName = scanner.nextLine();

        System.out.print("Nome do estado que a cidade fica: ");
        String stateName = scanner.nextLine();

        System.out.print("Idade do funcionario:");
        var age = scanner.nextInt();

        System.out.print("Quanto tempo do funcionario esta na empresa:");
        var tenure = scanner.nextInt();

        System.out.print("Salario do funcionario:");
        var salary = scanner.nextDouble();

        System.out.printf("%nNome: %s%n", name);
        System.out.printf("Cargo: %s%n", jobTitle);
        System.out.printf("Cidade: %s%n", cityName);
        System.out.printf("Estado: %s%n", stateName);
        System.out.printf("Idade: %d%n", age);
        System.out.printf("Tempo de empresa: %d anos%n", tenure);
        System.out.printf("Salario: %.2f%n", salary);

        scanner.close();

    }
}


