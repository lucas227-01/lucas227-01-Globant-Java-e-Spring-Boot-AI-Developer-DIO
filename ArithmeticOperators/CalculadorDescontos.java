package ArithmeticOperators;
import java.util.Scanner;

public class CalculadorDescontos {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor do produto: ");
        double productValue = scanner.nextDouble();

        System.out.print("Insira o quanto de desconto você recebeu: ");
        double discount = scanner.nextDouble();

        double result = productValue * (discount / 100.0);
        double finalValue = productValue - result;

        System.out.printf("%nDesconto de R$: %.2f%n", result);
        System.out.printf("%nValor final R$: %.2f%n", finalValue);

        scanner.close();
    }
}
