/*
Criar uma classe carro com os seguintes atributos
ligado
capacidadeTanque
combustivel
velocidade

criar métodos adequados para a utilização de um carro
e também um método que exibe os detalhes do carro.

depois, criar uma classe aplicativo com o método main
 e instanciar dois carro.
Testar estes carros rodando seus métodos..
Você deve receber os dados do usuário com a classe Scanner
*/

public class Carro
{
    private String placa;
    private int capacidadeTanque;
    private double combustivel;
    private double combustivelGasto;
    private boolean ligado;
    private int velocidade;
    private int velocidadeAtingida;

    public Carro()
    {
        this.placa = "";
        this.capacidadeTanque = 25;
        this.combustivel = 0;
        this.combustivelGasto = 0;
        this.ligado = false;
        this.velocidade = 0;
        this.velocidadeAtingida = 0;
    }
    //GETTERS e SETTERS
    public void setPlaca(String placa)
    {
        this.placa = placa;
    }

    public String getPlaca()
    {
        return this.placa;
    }

    public void setCombustivel(double combustivel)
    {
        if(combustivel <= this.capacidadeTanque)
        {
            this.combustivel = combustivel;
        } else{
            this.combustivel = this.capacidadeTanque;
        }
    }

    public double getCombustivel()
    {
        return this.combustivel;
    }

    public double getCombustivelGasto()
    {
        return this.combustivelGasto;
    }

    public void acelerar()
    {
        if(this.combustivel>0 && this.ligado == true)
        {
            this.velocidade ++;
            this.combustivel --;
            this.combustivelGasto ++;
            this.velocidadeAtingida ++; 
        } else{
            this.velocidade = 0;
        }
    }

    public int getVelocidade()
    {
        return this.velocidade;
    }

    public int getVelocidadeAtingida()
    {
        return this.velocidadeAtingida;
    }

    public String isLigado()
    {
        if(this.ligado){
            return "\nCarro ligado";
        } else{
            return "\nCarro desligado";
        }
    }
    //Ligar o carro
    public void ligar()
    {
        this.ligado = true;
    }
    //Desligar o carro
    public void desligar()
    {
        this.ligado = false;
    }
    //Imprimir os dados
    public String imprimirDetalhes()
    {
        return "\nPlaca:" + getPlaca() + 
                "\nCombustivel total: " + getCombustivel() +
                "\nCombustível gasto: " + getCombustivelGasto() +
                isLigado() +
                "\nVelocidade: " + getVelocidade() +
                "\nVelocidade atingida: " + getVelocidadeAtingida();
    }
}