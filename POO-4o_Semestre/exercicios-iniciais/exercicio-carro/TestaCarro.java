import java.util.Scanner;

public class TestaCarro {
    public static void main(String args[])
    {
        Carro gol = new Carro();
        Carro opala = new Carro();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a placa:");
        System.out.print("1º: ");
        gol.setPlaca(entrada.nextLine());
        System.out.print("2º: ");
        opala.setPlaca(entrada.nextLine());
  	
        System.out.println("Informe a quantidade de combustível:");
        System.out.print("1º: ");
        gol.setCombustivel(entrada.nextDouble());
        System.out.print("2º: ");
        opala.setCombustivel(entrada.nextDouble());

        gol.ligar();
        gol.acelerar();
        gol.acelerar();
        gol.acelerar();
        gol.desligar();
        gol.acelerar();
        gol.acelerar();

        opala.ligar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.desligar();

        System.out.println(gol.imprimirDetalhes());
        System.out.println(opala.imprimirDetalhes());

        entrada.close();
    }
}

