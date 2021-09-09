/*Criar um projeto de  carro (novamente), onde, quando
acelerar o carro, caso ele entre na reserva
(10% ou menos do tanque), avisar o usuário.
Criar o campo velocidade máxima, e o carro 
deverá respeitar esse valor. 
Veja que carros que tem motor mais potente
gastam mais gasolina. Lembre-se que
o carro só anda ligado e com gasolina,
que ele precisa abastecer, etc.
Você é livre para escolher os atributos do
carro, mas alguns são obrigatórios, como
apresentado anteriormente.
Ao criar o carro é preciso informar no 
construtor o modelo, capacidade do tanque,
velocidade máxima e potencia do motor(1.0,
1.4, 1.8, etc).
No método main, receba as informações
iniciais do carro e crie um menu para o
usuário interagir com o carro como...
acelerar
frear
ligar
abastecer
etc....*/

public class Carro {
    private String modelo;
    private String placa;
    private double potenciaMotor;
    private int capacidadeTanque;
    private double combustivel;
    //private double combustivelGasto;
    private boolean ligado;
    private int velocidade;
    private int velocidadeMaxima;
    //private int velocidadeAtingida;

    public Carro(String modelo, String placa, double potenciaMotor, int capacidadeTanque, int velocidadeMaxima){
        setModelo(modelo);
        setPlaca(placa);
        setPotenciaMotor(potenciaMotor);
        setCapacidadeTanque(capacidadeTanque);
        setVelocidadeMaxima(velocidadeMaxima);
        this.velocidade = 0;
    }

    private void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return this.modelo;
    }

    private void setPlaca(String placa){
        this.placa = placa;
    }

    public String getPlaca(){
        return this.placa;
    }

    private void setPotenciaMotor(double potenciaMotor){
        if(this.potenciaMotor>=1.0 && this.potenciaMotor<=2.0){
            this.potenciaMotor = potenciaMotor;
        } 
    }

    public double getPotenciaMotor(){
        return this.potenciaMotor;
    }

    private void setCapacidadeTanque(int capacidadeTanque){
        if(capacidadeTanque > 0){
            this.capacidadeTanque = capacidadeTanque;
        }
    }

    public int getCapacidadeTanque(){
        return this.capacidadeTanque;
    }

    public void abastecer(double combustivel){
        if(this.combustivel<=this.capacidadeTanque){
            this.combustivel = combustivel;
        } else{
            this.combustivel = this.capacidadeTanque;
        }  
    }

    public double getCombustivel(){
        return this.combustivel;
    }

    private void setVelocidadeMaxima(int velocidadeMaxima){
        if(this.velocidadeMaxima>0){
            this.velocidadeMaxima = velocidadeMaxima;
        }
    }

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
    }

    public void acelerar()
    {
        if(this.combustivel>0 && this.ligado == true)
        {
            this.velocidade = this.velocidade + 10;
            this.combustivel = this.combustivel - this.potenciaMotor;
            System.out.println("Velocidade atual: " + this.velocidade);
            System.out.println("Combustivel: " + this.combustivel);
            if(this.combustivel <= this.capacidadeTanque*0.1){
                System.out.println("A capacidade do tanque está baixa. Por favor, abasteça.");
            }
            if(this.velocidade > this.velocidadeMaxima){
                this.velocidade = velocidadeMaxima;
            }
        } else{
            System.out.println("Não foi possível acelerar");
            this.velocidade = 0;
        }
    }

    public int getVelocidade(){
        return this.velocidade;
    }

    public void frear(){
        this.velocidade = 0;
    }
}
