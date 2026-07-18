package ifelse;
import java.util.Scanner;

public class ClassificadorDeCategoriaDeAtleta {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a idade do atleta: ");
        int age = scanner.nextInt();

        if(age < 10){
            System.out.printf("%n%d anos, está na categoria mirim", age);
        }else if(age >= 10 && age <= 14){
            System.out.printf("%n%d anos, está na categoria infantil", age);
        }else if(age >= 15 && age <= 19){
            System.out.printf("%n%d anos, está na categoria juvenil", age);
        }else{
            System.out.printf("%n%d anos, está na categoria adulto", age);
        }

        scanner.close();
    }
}
