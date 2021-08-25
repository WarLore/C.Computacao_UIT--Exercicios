import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        //Criando os objetos
        Eleitor cidadao = new Eleitor();
        Scanner entrada = new Scanner(System.in);
        
        //Requisitando os dados do objeto ao usuário
        System.out.println("Informe o nome:");
        cidadao.setNome(entrada.nextLine());

        System.out.println("Informe o seu sexo:");
        cidadao.setSexo(entrada.nextLine());

        System.out.println("Informe a idade: ");
        cidadao.setIdade(entrada.nextInt());

        System.out.println("Informe o titulo de eleitor: ");
        cidadao.setTitulo(entrada.nextInt());

        //Verificar o estado do eleitor
        System.out.println(cidadao.verificarEstadoVotacao());
        
        entrada.close();
    }
}