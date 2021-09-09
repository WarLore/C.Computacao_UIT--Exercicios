import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        Pessoa paulo = new Pessoa();
        Pessoa millena = new Pessoa();

        System.out.println("Informe o nome:");
        System.out.print("1º: ");
        paulo.setNome(entrada.nextLine());
        System.out.print("2º: ");
        millena.setNome(entrada.nextLine());

        System.out.println("Informe seu sexo:");
        System.out.print("1º: ");
        paulo.setSexo(entrada.nextLine());
        System.out.print("2º: ");
        millena.setSexo(entrada.nextLine());
        
        System.out.println("Informe seu peso:");
        System.out.print("1º: ");
        paulo.setPeso(entrada.nextDouble());
        System.out.print("2º: ");
        millena.setPeso(entrada.nextDouble());

        System.out.println("Informe a altura:");
        System.out.print("1º: ");
        paulo.setAltura(entrada.nextDouble());
        System.out.print("2º: ");
        millena.setAltura(entrada.nextDouble());

        entrada.close();

        paulo.calcularIMC();
        millena.calcularIMC();

        System.out.println(paulo.informarCondicao());
        System.out.println(millena.informarCondicao());

        System.out.println(paulo.imprimirDados());
    }
}
