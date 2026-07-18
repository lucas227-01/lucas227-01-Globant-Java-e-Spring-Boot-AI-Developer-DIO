package ifelse;
import java.util.Scanner;

public class MaiorDeIdade {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira sua idade: ");
        int age = scanner.nextInt();

        if(age >= 18){
            System.out.println("Você é maior de idade");
        }else{
            System.out.println("Você é menor de idade");
        }

        scanner.close();

    }
}
