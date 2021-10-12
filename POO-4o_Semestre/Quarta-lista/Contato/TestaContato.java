/*Agora, criar uma classe Contato, que deverá ter o nome, o telefone e a cidade da pessoa, id autoincremento e também um booleano ativo. Crie uma classe Testa que possui um arrayList de contatos. Crie um menu para adicionar, remover, listar, listar inativos, ativar contato, bloquear contato, buscar por nome, listar por cidade, limpar agenda. Obs. Listar, listar por cidade e listar por nome só devem exibir os ativos.*/

import java.util.ArrayList;
import java.util.Scanner;

public class TestaContato {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        ArrayList<Contato> agenda = new ArrayList<>();
        int opcao;

        do{
            menu();
            opcao = entrada.nextInt();
            entrada.nextLine();
            String nome, telefone, cidade;
            int i, metodo, idContato;
            switch(opcao){
                case 1:
                    System.out.println("Informe o nome: ");
                    nome = entrada.nextLine();
                    System.out.println("Informe o telefone: ");
                    telefone = entrada.nextLine();
                    System.out.println("Informe a cidade: ");
                    cidade = entrada.nextLine();
                    Contato contato = new Contato(nome, telefone, cidade);
                    agenda.add(contato);
                    break;
                case 2:
                    System.out.println("Selecione o método de busca:[1 - Nome/2 - ID]");
                    metodo = entrada.nextInt();
                    switch(metodo){
                        case 1:
                            System.out.println("Informe o nome do contato:");
                            String nomeRemover = entrada.nextLine();
                            for(i = 0; i<agenda.size(); i++){
                                Contato contatos = agenda.get(i);
                                if(contatos.getNome().equals(nomeRemover)){
                                    agenda.remove(contatos);
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Informe o ID:");
                            idContato = entrada.nextInt();
                            contato = agenda.get(idContato-1);
                            agenda.remove(contato);
                            break;
                    }
                    
                case 3:
                    System.out.println("Selecione o método de busca:[1 - Nome/2 - ID]");
                    metodo = entrada.nextInt();
                    entrada.nextLine();
                    switch(metodo){
                        case 1:
                            System.out.println("Informe o nome: ");
                            nome = entrada.nextLine();
                            for(i = 0; i<agenda.size(); i++){
                                contato = agenda.get(i);
                                if(contato.getNome().equals(nome)){
                                    contato.ativar();
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Informe o ID:");
                            idContato = entrada.nextInt();
                            contato = agenda.get(--idContato);
                            contato.ativar();
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Selecione o método de busca:[1 - Nome/2 - ID]");
                    metodo = entrada.nextInt();
                    entrada.nextLine();
                    switch(metodo){
                        case 1:
                            System.out.println("Informe o nome: ");
                            nome = entrada.nextLine();
                            for(i = 0; i<agenda.size(); i++){
                                contato = agenda.get(i);
                                if(contato.getNome().equals(nome)){
                                    contato.desativar();
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Informe o ID:");
                            idContato = entrada.nextInt();
                            contato = agenda.get(--idContato);
                            contato.desativar();
                            break;        
                    }
                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Informe o nome: ");
                    String nomeBusca = entrada.nextLine();
                    for(i = 0; i<agenda.size(); i++){
                        Contato contatoBusca = agenda.get(i);
                        if(contatoBusca.getNome().equals(nomeBusca)){
                            System.out.println(contatoBusca);
                            i = agenda.size();
                        }
                    }
                    break;
                case 7:
                    for(i = 0; i<agenda.size(); i++){
                        contato = agenda.get(i);
                        if(contato.isAtivo()){
                            System.out.println(contato);
                        }
                    }
                    break;
                case 8:
                    System.out.println("Selecione a categoria: [1 - Nome/2 - Cidade]");
                    metodo = entrada.nextInt();
                    switch(metodo){
                        case 1:
                            System.out.println("Informe o nome: ");
                            nome = entrada.nextLine();
                            entrada.nextLine();
                            for(i = 0; i<agenda.size(); i++){
                                contato = agenda.get(i);
                                if(contato.getNome().equals(nome)&&contato.isAtivo()){
                                    System.out.println(contato.toString());
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Informe a cidade: ");
                            cidade = entrada.nextLine();
                            entrada.nextLine();
                            for(i = 0; i<agenda.size(); i++){
                                contato = agenda.get(i);
                                if(contato.getCidade().equals(cidade)&&contato.isAtivo()){
                                    System.out.println(contato.toString());
                                }
                            }
                            break;
                    }
                    break;
                case 9:
                    for(i = 0; i<agenda.size(); i++){
                        contato = agenda.get(i);
                        if(contato.isAtivo()==false){
                            System.out.println(contato);
                        }
                    }
                    break;
                case 10:
                    agenda.clear();
                    break;
                default:
                    System.out.println("Por favor, informe uma opção válida.");
                    break;
            }
        }while(opcao!=0);
        entrada.close();
    }

    public static void menu(){
        System.out.println("Informe a opcão:");
        System.out.println("0 - Sair do sistema");
        System.out.println("1 - Adicionar contato");
        System.out.println("2 - Remover contato");
        System.out.println("3 - Ativar contato");
        System.out.println("4 - Desativar contato");
        System.out.println("5 - Bloquear contato");
        System.out.println("6 - Buscar contato");
        System.out.println("7 - Listar contatos");
        System.out.println("8 - Listar por categoria");
        System.out.println("9 - Listar inativos");
        System.out.println("10 - Limpar agenda");

    }
}
