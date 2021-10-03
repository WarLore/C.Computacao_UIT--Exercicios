
import java.util.Scanner;

public class TestaCelular {
    public static void main(String[] args){

        int nivelBateria, nivelSom, opcao, som;
        String modelo;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o modelo do celular:");
        modelo = entrada.nextLine();
        System.out.println("Informe o nível da bateria:");
        nivelBateria = entrada.nextInt();
        System.out.println("Informe o nível do som:");
        nivelSom= entrada.nextInt();
        
        Celular celular1 = new Celular(modelo, nivelBateria, nivelSom);
        
        do{
            menu();
            opcao = entrada.nextInt();

            switch(opcao){
                case 0:
                    System.out.println("Sistema fechado");
                    break;
                case 1:
                    celular1.ligar();
                    break;
                case 2:
                    celular1.carregarBateria();
                    System.out.println("A bateria está em " + celular1.getNivelBateria() + "%");
                    break;
                case 3:
                    if(celular1.getNivelBateria()>0 && celular1.isLigado()){
                        int escolhaJogador, resultado;
                        do{
                            System.out.println("O jogo é PEDRA, PAPEL OU TESOURA");   
                            System.out.println("Informe sua escolha: ");
                            System.out.println("0 - Pedra\n1 - Papel\n2 - Tesoura");

                            escolhaJogador = entrada.nextInt();
                        }while(escolhaJogador<0 || escolhaJogador>2);
    
                        resultado = celular1.jogar(escolhaJogador);

                        if(resultado==0){
                            System.out.println("Você perdeu.");
                        } else if(resultado==1){
                            System.out.println("Você ganhou.");
                        } else{
                            System.out.println("Empate");
                        }
                    } else{
                        System.out.println("Não foi possível jogar.");
                    }
                    break;
                case 4:
                    System.out.println("Informe o nível de volume que deseja aumentar:");
                    som = entrada.nextInt();
                    celular1.aumentarVolume(som);
                    break;
                case 5:
                    System.out.println("Informe o nível de volume que deseja diminuir:");
                    som = entrada.nextInt();
                    celular1.diminuirVolume(som);
                    break;
                case 6:
                    System.out.println(celular1);
                    break;
                default:
                    System.out.println("Opção inválida, por favor, selecione uma opção válida.");
                    break;
            }
        } while(opcao!=0);
        entrada.close();
    }

    public static void menu(){
        System.out.println("Selecione uma opção:");
        System.out.println("0 - Sair");
        System.out.println("1 - Ligar");
        System.out.println("2 - Recarregar");
        System.out.println("3 - Jogar");
        System.out.println("4 - Aumentar volume");
        System.out.println("5 - Diminuir volume");
        System.out.println("6 - Mostrar informações");
    }
}
