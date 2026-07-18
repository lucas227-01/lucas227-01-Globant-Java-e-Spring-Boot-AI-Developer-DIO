package ArithmeticOperators;
import java.util.Scanner;

public class ConversaoDeTempo {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantas horas Você deseja converter: ");
        var hours = scanner.nextInt();

        var minutes = hours * 60;
        var seconds = minutes * 60;

        System.out.printf("%nHoras: %d%n", hours);
        System.out.printf("Minutos: %d%n", minutes);
        System.out.printf("Segundos: %d%n", seconds);

        scanner.close();
    }
}
