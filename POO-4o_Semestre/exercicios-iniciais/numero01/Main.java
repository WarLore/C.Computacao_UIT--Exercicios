import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {   
        //Instanciando os objetos
        Scanner entrada = new Scanner(System.in);
        Trabalhador pedreiro = new Trabalhador();
        Trabalhador programador = new Trabalhador();
        Trabalhador professor = new Trabalhador();

        //Solicitando a matrícula dos trabalhadores para o usuário
        System.out.println("Informe a matrícula:");
        System.out.print("1º: ");
        pedreiro.setMatricula(entrada.nextInt());
        System.out.print("2º: ");
        programador.setMatricula(entrada.nextInt());
        System.out.print("3º: ");
        professor.setMatricula(entrada.nextInt());
        clearBuffer(entrada);
        
        //Solicitando o nome dos trabalhadores para o usuário
        System.out.println("Informe o nome: ");
        System.out.print("1º: ");
        pedreiro.setNome(entrada.nextLine());
        System.out.print("2º: ");
        programador.setNome(entrada.nextLine());
        System.out.print("3º: ");
        professor.setNome(entrada.nextLine());

        //Solicitando o salario dos trabalhadores para o usuário
        System.out.println("Informe o salário: ");
        System.out.print("1º: ");
        pedreiro.setSalario(entrada.nextDouble());
        System.out.print("2º: ");
        programador.setSalario(entrada.nextDouble());
        System.out.print("3º: ");
        professor.setSalario(entrada.nextDouble());

        //Imprimindo os dados dos trabalhadores
        System.out.println(pedreiro.imprimirDados());
        System.out.println(programador.imprimirDados());
        System.out.println(professor.imprimirDados());

        entrada.close();
    }
    //Método para limpar o buffer, mesma função do fflush() no C
    private static void clearBuffer(Scanner scanner) 
    {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
