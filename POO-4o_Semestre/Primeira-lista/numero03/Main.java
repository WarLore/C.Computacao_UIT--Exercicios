import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        String nome, vencimento = "31/12/2021";
        double valorBoleto, valorDescontoBoleto;

        System.out.println("Informe seu nome:");
        nome = entrada.nextLine();

        System.out.println("Informe o valor do boleto:");
        valorBoleto = entrada.nextDouble();

        System.out.println("Informe o valor do desconto:");
        valorDescontoBoleto = entrada.nextDouble();

        Boleto boleto1 = new Boleto(nome, vencimento, valorBoleto, valorDescontoBoleto);

        boleto1.pagarBoleto();
        System.out.println(boleto1.imprimirDados());

        entrada.close();
    }
}