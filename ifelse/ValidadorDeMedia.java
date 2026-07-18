package ifelse;
import java.util.Scanner;

public class ValidadorDeMedia {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira sua media final: ");
        double finalAverage = scanner.nextDouble();

        if(finalAverage >= 7){
            System.out.println("Parabéns, você foi aprovado!");
        }else{
            System.out.println("Infelizmente, você ficou de recuperação");
        }

        scanner.close();
    }
}
