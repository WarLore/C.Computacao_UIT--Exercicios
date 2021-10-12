import java.util.ArrayList;
import java.util.Scanner;

/*Criar um arraylist de string chamado contatinhos.
Criar um menu para:
inserir contatos
remover contatos pelo nome
mostrar a quantidade de contatos
listar todos contatos*/
public class MainContatinhos{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> contatos = new ArrayList<>();
        int opcao;

        do{
            System.out.println("\nInforme a opção:");
            System.out.println("0 - Sair do sistema");
            System.out.println("1 - Inserir contato");
            System.out.println("2 - Remover contato");
            System.out.println("3 - Mostrar quantidade");
            System.out.println("4 - Mostrar todos os contatos");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch(opcao){
                case 0:
                    System.out.println("Sistema fechado.");
                    break;
                case 1:
                    System.out.println("Informe o nome do contato:");
                    contatos.add(entrada.nextLine());
                    break;
                case 2:
                    System.out.println("Informe o nome do contato:");
                    String nome = entrada.nextLine();
                    
                    if(contatos.contains(nome)){
                        contatos.remove(nome);
                    }else{
                        System.out.println("O contato informado não existe.");
                    }
                    break;
                case 3:
                    System.out.printf("Quantidade contatos: %d\n", contatos.size());
                    break;
                case 4:
                    System.out.println("Contados cadastrados:");
                    int contador = 1;
                    for(String contato : contatos){
                        System.out.printf("%dº: %s\n", contador, contato);
                        contador++;
                    }
                    break;
                default:
                    System.out.println("Opção inválida, por favor, tente novamente.");
                    break;
            }
        }while(opcao!=0);
        entrada.close();
    }
}