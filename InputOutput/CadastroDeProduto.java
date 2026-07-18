package InputOutput;

import java.util.Scanner;

public class CadastroDeProduto {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o nome do produto: ");
        String nameProduct = scanner.nextLine();

        System.out.print("Insira o valor do produto: ");
        double valueProduct = scanner.nextDouble();

        System.out.print("Insira a quantidade de produtos no carrinho:");
        int quantityProduct = scanner.nextInt();

        System.out.printf("%nProduto: %s%n", nameProduct);
        System.out.printf("Preço: %.2f%n", valueProduct);
        System.out.printf("Quantidade: %d%n", quantityProduct);

        scanner.close();

    }
}
