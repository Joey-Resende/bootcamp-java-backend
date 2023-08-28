import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner1 = new Scanner(System.in).useLocale(Locale.US);
        Scanner scanner2 = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = scanner1.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner2.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = scanner1.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = scanner2.nextDouble();
        scanner1.close();
        scanner2.close();

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");

    }
}
