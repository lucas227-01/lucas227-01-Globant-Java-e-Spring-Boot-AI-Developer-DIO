package ifelse;
import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.printf("%n%d é Par%n", number);
        } else{
            System.out.printf("%n%d é Ímpar%n", number);
        }

        scanner.close();

    }
}
