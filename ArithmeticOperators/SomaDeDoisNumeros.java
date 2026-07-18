package ArithmeticOperators;
import java.util.Scanner;

public class SomaDeDoisNumeros {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor do primeiro numero: ");
        int number1 = scanner.nextInt();

        System.out.print("Insira o valor do segundo numero: ");
        int number2 = scanner.nextInt();

        System.out.printf("%d + %d = %d%n", number1, number2, number1 + number2);

        scanner.close();
    }
}
