import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        String nome;
        double pesoMaximo;
        int capacidadeMaxima, opcao;

        System.out.print("Informe o nome da mochila: ");
        nome = entrada.nextLine();
        System.out.print("Informe o peso máximo: ");
        pesoMaximo = entrada.nextDouble();
        System.out.print("Informe a quantidade máxima de itens: ");
        capacidadeMaxima = entrada.nextInt();
        
        Mochila mochila = new Mochila(nome, pesoMaximo, capacidadeMaxima);
        
        do{
            double peso;
            System.out.print("Informe o peso do item a ser adicionado na mochila:");
            peso = entrada.nextDouble();
            mochila.inserirItens(peso);   
            entrada.nextLine();
            System.out.println("Deseja adicionar mais itens?[0-NÂO/1-SIM]");
            opcao = entrada.nextInt();
        } while(opcao==1);

        System.out.println(mochila);
        entrada.close();
    }
}
