package ArithmeticOperators;
import java.util.Scanner;

public class CompraNoMercado {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Nome do produto: ");
        String productName = scanner.nextLine();

        System.out.print("Quantos produtos você comprou: ");
        var quantity = scanner.nextInt();

        System.out.print("Valor do produto: ");
        var productValue = scanner.nextDouble();

        var total = productValue * quantity;

        System.out.printf("%nTotal a pagar: %.2f%n", total);

        System.out.print("Insira o valor para pagamento: ");
        var payment = scanner.nextDouble();

        var change = payment - total;

        System.out.printf("%nTroco: %.2f%n", change);




        scanner.close();
    }
}
