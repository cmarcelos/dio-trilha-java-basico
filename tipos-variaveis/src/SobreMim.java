import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        double altura;
        while (true) {
            try {
                System.out.println("Digite sua altura (em metros, por exemplo, 1.75):");
                altura = scanner.nextDouble();
                break; // sai do loop se a entrada for válida
            } catch (java.util.InputMismatchException e) {
                System.out.println("Altura inválida! Digite um número decimal válido.");
                scanner.nextLine(); // consome a entrada inválida
            }
        }

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " metros");
        
        
    }
}
