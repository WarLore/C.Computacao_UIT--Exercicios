import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int opcao;
        String modelo, placa;
        double potenciaMotor;
        int capacidadeTanque, velocidadeMaxima;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o modelo do veiculo:");
        modelo = entrada.nextLine();
        System.out.println("Informe a placa do veiculo:");
        placa = entrada.nextLine();
        System.out.println("Informe o modelo do motor:");
        potenciaMotor = entrada.nextDouble();
        System.out.println("Informe a capacidade máxima do tanque:");
        capacidadeTanque = entrada.nextInt();
        System.out.println("Informe a velocidade máxima:");
        velocidadeMaxima = entrada.nextInt();

        Carro veiculo = new Carro(modelo, placa, potenciaMotor, capacidadeTanque, velocidadeMaxima);

        do{
            System.out.println("Informe a opção desejada:");
            System.out.println("1 - Ligar");
            System.out.println("2 - Abastecer");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Frear");
            System.out.println("5 - Desligar");
            opcao = entrada.nextInt();

            switch(opcao){
                case 1:
                    veiculo.ligar();
                    System.out.print("O carro está ligado");
                    break;
                case 2:
                    double combustivel;
                    System.out.print("Informe a quantidade de combustivel:");
                    combustivel = entrada.nextDouble();
                    veiculo.abastecer(combustivel);
                    System.out.println("O tanque está com " + veiculo.getCombustivel());
                    break;
                case 3:
                    veiculo.acelerar();
                    System.out.println("Velocidade: " + veiculo.getVelocidade());
                    break;
                case 4:
                    veiculo.frear();
                    System.out.println("Velocidade autal:" + veiculo.getVelocidade());
                    break;
                case 5:
                    veiculo.desligar();
                    System.out.println("O veiculo está desligado.");
                case 6:
                    System.out.println("Sistema fechado");
                    break;
                default:
                    System.out.println("Opção inválida, por favor, tente novamente");
                    break;
                }
        } while(opcao!=6);
        entrada.close();
    }
}
