import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        int opcao;
        String modelo, placa;
        double potenciaMotor, velocidadeMaxima;
        int capacidadeTanque;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o modelo do veiculo:");
        modelo = entrada.nextLine();
        System.out.println("Informe a placa do veiculo:");
        placa = entrada.nextLine();
        System.out.println("Informe a potência do motor:");
        potenciaMotor = entrada.nextDouble();
        System.out.println("Informe a capacidade máxima do tanque:");
        capacidadeTanque = entrada.nextInt();
        System.out.println("Informe a velocidade máxima:");
        velocidadeMaxima = entrada.nextDouble();

        Carro veiculo = new Carro(modelo, placa, potenciaMotor, capacidadeTanque, velocidadeMaxima);
        
        do{
            System.out.println("Informe a opção desejada:");
            System.out.println("0 - Sair");
            System.out.println("1 - Ligar");
            System.out.println("2 - Abastecer");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Frear");
            System.out.println("5 - Desligar");
            opcao = entrada.nextInt();

            switch(opcao){
                case 0:
                    System.out.println("Sistema fechado.");
                    break;
                case 1:
                    System.out.print(veiculo.ligar());
                    break;
                case 2:
                    double combustivel;
                    System.out.print("Informe a quantidade de litros de combustivel:");
                    combustivel = entrada.nextDouble();
                    veiculo.abastecer(combustivel);
                    System.out.println("O tanque está com " + veiculo.getCombustivel() + " litros");
                    break;
                case 3:
                    veiculo.acelerar();
                    System.out.println("Velocidade atual: " + veiculo.getVelocidade());
                    System.out.println("Combustivel restante: " + veiculo.getCombustivel());
                    break;
                case 4:
                    System.out.println(veiculo.frear());
                    System.out.println("Velocidade autal:" + veiculo.getVelocidade());
                    break;
                case 5:
                    System.out.println(veiculo.desligar());
                    break;
                default:
                    System.out.println("Opção inválida, por favor, tente novamente");
                    break;
                }
        } while(opcao!=0);
        entrada.close();
    }
}
