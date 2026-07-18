package ArithmeticOperators;
import java.util.Scanner;

public class MediaDeNotas {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a primeira nota: ");
        var grade1 = scanner.nextDouble();

        System.out.print("Insira a segunda nota: ");
        var grade2 = scanner.nextDouble();

        System.out.print("Insira a terceira nota: ");
        var grade3 = scanner.nextDouble();

        var averageGrade = (grade1 + grade2 + grade3) / 3;

        System.out.printf("%nMedia: %.2f%n", averageGrade);

        scanner.close();
    }
}
