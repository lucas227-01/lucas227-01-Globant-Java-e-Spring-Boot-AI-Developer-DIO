package ArithmeticOperators;
import java.util.Scanner;

public class AsQuatroOperacoes {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        double number1 = scanner.nextDouble();

        System.out.print("Insira o segundo valor: ");
        double number2 = scanner.nextDouble();

        var soma = number1 + number2;
        var subtracao = number1 - number2;
        var multiplicacao = number1 * number2;
        var divisao = number1 / number2;

        System.out.printf("%n%.2f + %.2f = %.2f%n", number1, number2, soma);
        System.out.printf("%.2f - %.2f = %.2f%n", number1, number2, subtracao);
        System.out.printf("%.2f x %.2f = %.2f%n", number1, number2, multiplicacao);
        System.out.printf("%.2f / %.2f = %.2f%n", number1, number2, divisao);

        scanner.close();
    }
}
