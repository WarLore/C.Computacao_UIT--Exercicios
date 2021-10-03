import java.util.Scanner;

public class Main 
{
    public static void main(String args[])
    {
        //Criando os objetos
        Scanner entrada = new Scanner(System.in);
        Produto produto1 = new Produto();
        //Solicitando os dados ao usuario e atribuindo aos objetos
        System.out.println("Informe o nome do produto:");
        produto1.setNome(entrada.nextLine());

        System.out.println("Informe o preço de custo:");
        produto1.setPrecoCusto(entrada.nextDouble());

        System.out.println("Informe o preço de venda:");
        produto1.setPrecoVenda(entrada.nextDouble());

        //Imprimindo os dados
        System.out.println("\nA margem de lucro é de R$ " + produto1.calcularMargemLucro());
        System.out.println("A margem de lucro percentual é de " + produto1.getMargemLucroPorcentagem() + "%");
   
        entrada.close();
    }
}
