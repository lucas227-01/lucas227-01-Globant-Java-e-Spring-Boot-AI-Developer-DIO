package ifelse;
import java.util.Scanner;

public class PositivoNegativoOuZero {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        int number = scanner.nextInt();

        if(number == 0){
            System.out.println("Zero");
        }else if(number > 0){
            System.out.println("Numero positivo");
        }else{
            System.out.println("Numero negativo");
        }

        scanner.close();

    }
}
