import java.util.Scanner;

public class TestaCarro {
    public static void main(String args[])
    {
        //Criação do objetos
        Carro gol = new Carro();
        Carro opala = new Carro();
        Scanner entrada = new Scanner(System.in);

        //Resgatando dados do usuário e atribuindo aos objetos
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

        //Chamando alguns métodos dos objetos
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
        
        //Imprimindo os dados dos objetos
        System.out.println(gol.imprimirDetalhes());
        System.out.println(opala.imprimirDetalhes());

        entrada.close();
    }
}

