import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int quantidadeCanais, volumeMaximo, opcao, volume;
        String marca;

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o marca: ");
        marca = entrada.nextLine();

        System.out.print("Informe a quantidade de canais: ");
        quantidadeCanais = entrada.nextInt();
        System.out.print("Informe o volume máximo: ");
        volumeMaximo = entrada.nextInt();

        Televisao tv = new Televisao(marca, quantidadeCanais, volumeMaximo);
        
        System.out.println();

        do{
            menu();
            opcao = entrada.nextInt();
            switch(opcao){
                case 0:
                    System.out.println("Programa fechado");
                    break;
                case 1:
                    System.out.println(tv.ligar());
                    break;
                case 2:  
                    int canal, escolha;
                    System.out.println("Deseja informar o canal desejado?[1 - SIM/0 - NÃO]");
                    escolha = entrada.nextInt();
                    entrada.nextLine();
                    
                    if(escolha==1){
                        System.out.println("Informe o canal:");
                        canal = entrada.nextInt();
                        System.out.println(tv.trocarCanal(canal));
                        
                    } else{
                        tv.trocarCanal();
                        
                    }
                    System.out.printf("Canal Atual: %d", tv.getCanalAtual());

                    break;
                case 3:
                    System.out.println("Informe o valor:: ");
                    volume = entrada.nextInt();
                    tv.aumentarVolume(volume);
                    System.out.printf("Volume atual: %d", tv.getVolume());
                    break;
                case 4:
                    System.out.println("Informe o valor:: ");
                    volume = entrada.nextInt();
                    tv.diminiuirVolume(volume);
                    System.out.printf("Volume atual: %d", tv.getVolume());
                    break;
                case 5:
                    System.out.println(tv.desligar());
                    break;
                case 6:
                    System.out.println(tv);
                    break;
                default:
                    System.out.println("Opção invalida. Por favor, digite uma opção válida");
                    break;
            }
        } while(opcao!=0);

        entrada.close();
    }

    public static void menu(){
        System.out.println();
        System.out.println("Selecione a opcçaõ:");
        System.out.println("0 - Sair");
        System.out.println("1 - Ligar ");
        System.out.println("2 - Mudar canal");
        System.out.println("3 - Aumentar volume");
        System.out.println("4 - Diminuir volume");
        System.out.println("5 - Desligar");
        System.out.println("6 - Mostrar detalhes");
    }
}
