import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        String nome, matricula;
        int  quantidade;
        double salario;

        
        System.out.println("Informe a quantidade de trabalhdores que serão cadastrados: ");
        quantidade = entrada.nextInt();
        clearBuffer(entrada);

        Trabalhador trabalhador[] = new Trabalhador[quantidade];
        
        for(int i = 0; i<trabalhador.length; i++){

            System.out.printf("%dº TRABALHADOR\n", i+1);
            
            System.out.print("Informe o nome: ");
            nome = entrada.nextLine();
            System.out.print("Informe a matricula: ");
            matricula = entrada.nextLine();
            System.out.print("Informe o salário: ");
            salario = entrada.nextDouble();
            clearBuffer(entrada);

            trabalhador[i] = new Trabalhador(nome, matricula, salario);
            System.out.println();
        }

        for(int i = 0; i<trabalhador.length; i++){
            System.out.printf("\n%dº TRABALHADOR\n", i+1);
            System.out.println(trabalhador[i]);
            System.out.println();
        }
        entrada.close();
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
