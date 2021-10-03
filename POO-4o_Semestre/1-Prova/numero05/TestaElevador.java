import java.util.Scanner;

public class TestaElevador {
    public static void main(String[] args)
    {
        //Criando as variáves e instanciando o Scanner
        int capacidadeMaxima, totalAndares, opcao, resposta, quantidadePessoas, andar;
        Scanner entrada = new Scanner(System.in);

        //Pedindo dados ao usuario
        System.out.print("Informe a capacidade máxima de pessoas: ");
        capacidadeMaxima = entrada.nextInt();
        System.out.print("Informe a quantidade de andares: ");
        totalAndares = entrada.nextInt();

        //Criando o objeto elevador e passando o dados informados pelo usuário
        Elevador elevador = new Elevador(capacidadeMaxima, totalAndares);

        do{
            menu();
            opcao = entrada.nextInt();
            
            //Verificando a opção e realizando a ação
            switch(opcao){
                case 1:
                    System.out.println("Vai entrar mais de uma pessoa?[0-NÃO / 1-SIM]");
                    resposta = entrada.nextInt();

                    if(resposta==1){
                        System.out.println("Informe a quantidade:");
                        quantidadePessoas = entrada.nextInt();
                        elevador.entrar(quantidadePessoas);
                    } else{
                        elevador.entrar();
                    }
                    break;
                case 2:
                    System.out.println("Vai sair mais de uma pessoa?[0-NÃO / 1-SIM]");
                    resposta = entrada.nextInt();

                    if(resposta==1){
                        System.out.println("Informe a quantidade:");
                        quantidadePessoas = entrada.nextInt();
                        elevador.remover(quantidadePessoas);
                    } else{
                        elevador.remover();
                    }
                    break;
                case 3:
                    System.out.println("Vai subir a um andar especifico?[0-NÃO / 1-SIM]");
                    resposta = entrada.nextInt();

                    if(resposta==1){
                        System.out.println("Informe qual andar:");
                        andar = entrada.nextInt();
                        elevador.subir(andar);
                    } else{
                        elevador.subir();
                    }
                    break;
                case 4:
                    System.out.println("Vai descer a um andar especifico?[0-NÃO / 1-SIM]");
                    resposta = entrada.nextInt();

                    if(resposta==1){
                        System.out.println("Informe qual andar:");
                        andar = entrada.nextInt();
                        elevador.descer(andar);
                    } else{
                        elevador.descer();
                    }
                    break; 
                case 5:
                    System.out.println(elevador);
                    break;
                case 6:
                    System.out.println("Sistema fechado");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;    
            }
        } while(opcao!=6);

        entrada.close();
    }
    //Menu usado para a seleção da opção
    public static void menu(){
        System.out.println("\nInforme a opção: ");
        System.out.println("1 - Entrar");
        System.out.println("2 - Sair");
        System.out.println("3 - Subir");
        System.out.println("4 - Descer");
        System.out.println("5 - Mostrar informações");
        System.out.println("6 - Sair do sistema");
    }
}
