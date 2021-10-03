import java.util.Scanner;

public class TestaComputador {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Computador[] computadores = new Computador[3];

        String fabricante;
        int tamanhoHd, tamanhoRam, qtdProcessadores, opcao, contador = 0;

        do{
            menu();
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch(opcao){
                case 0:
                    System.out.println("Sistema fechado.");
                    break;
                case 1:
                    if(Computador.quantidadeComputadores()<3){
                        System.out.printf("\n%d COMPUTADOR\n", contador+1);
                        System.out.print("\nInforme o fabricante: ");
                        fabricante = entrada.nextLine();
                        System.out.print("Informe o tamanho do HD: ");
                        tamanhoHd = entrada.nextInt();
                        System.out.print("Informe o tamanho da RAM: ");
                        tamanhoRam = entrada.nextInt();
                        System.out.print("Informe o tamanho a quantidade de processadores: ");
                        qtdProcessadores = entrada.nextInt();

                        computadores[contador] = new Computador(fabricante, tamanhoHd, tamanhoRam, qtdProcessadores);
                        contador++;
                    } else{
                        System.out.println("Não é possível criar mais computadores.");
                    }
                    break;
                case 2:
                    for(int i = 0; i<=Computador.quantidadeComputadores(); i++){
                        if(computadores[i].getTamanhoRam()>512){
                            System.out.println(computadores[i]);
                        } 
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Por favor digite outra.");
                    break;
            } 
        }while(opcao!=0);

        entrada.close();
    }

    public static void menu(){
        System.out.println("0 - Sair");
        System.out.println("1 - Cadastra");
        System.out.println("2 - Mostrar dados");
    }
}
