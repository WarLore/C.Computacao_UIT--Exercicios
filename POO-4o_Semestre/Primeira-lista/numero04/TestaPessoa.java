import java.util.Scanner;

public class TestaPessoa
{
    public static void main(String args[])
    {
        //Criando os objetos
        Scanner entrada = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        //Solicitar dados ao usuario e atribuir aos objetos
        System.out.println("Informe o nome:");
        System.out.print("1º pessoa: ");
        pessoa1.setNome(entrada.nextLine());
        System.out.print("2º pessoa: ");
        pessoa2.setNome(entrada.nextLine());

        System.out.println("Informe o endereco:");
        System.out.print("1º pessoa: ");
        pessoa1.setEndereco(entrada.nextLine());
        System.out.print("2º pessoa: ");
        pessoa2.setEndereco(entrada.nextLine());

        System.out.println("Informe o telefone:");
        System.out.print("1º pessoa: ");
        pessoa1.setTelefone(entrada.nextLine());
        System.out.print("2º pessoa: ");
        pessoa2.setTelefone(entrada.nextLine());
        
        entrada.close();
        
        //Imprmindo os dados dos objetos
        System.out.println("\n\nPESSOAS CADASTRADAS: ");
        System.out.println(pessoa1.imprimirDados());
        System.out.println(pessoa2.imprimirDados());  
    }
}