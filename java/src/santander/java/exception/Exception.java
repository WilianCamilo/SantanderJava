package santander.java.exception;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exception {s
    public static void main(String[] args) {


        try {

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Olá, como posso te chamarr? ");
            String nome = scanner.next();

            System.out.println("Qual o seu sobre nome? ");
            String sobreNome = scanner.next();

            System.out.println("qual sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura:");
            double altura = scanner.nextDouble();

            System.out.println("Ola me chamo " + nome.toLowerCase() + " " + sobreNome);
            System.out.println("tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + " cm ");
            scanner.close();
        } 
        catch ( InputMismatchException e){
            System.out.println(" Os campos idade e altura precisam ser numericos.");
        }

    }

}
