import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner1.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner2.nextInt();

        scanner1.close();
        scanner2.close();
        System.out.println(numero1);
        System.out.println(numero2);
    }
}
