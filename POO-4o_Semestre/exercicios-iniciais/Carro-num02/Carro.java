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
    private boolean ligado;
    private double velocidade;
    private double velocidadeMaxima;
    private double aceleracao;

    public Carro(String modelo, String placa, double potenciaMotor, int capacidadeTanque, double velocidadeMaxima){
        setModelo(modelo);
        setPlaca(placa);
        setPotenciaMotor(potenciaMotor);
        setCapacidadeTanque(capacidadeTanque);
        setVelocidadeMaxima(velocidadeMaxima);
    }
    //GETTERS E SETTERS
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
        if(potenciaMotor>=1 && potenciaMotor<=2){
            this.potenciaMotor = potenciaMotor;
        } else{
            this.potenciaMotor = 1.0;
        }  
    }

    public double getPotenciaMotor(){
        return this.potenciaMotor;
    }

    private void setCapacidadeTanque(int capacidadeTanque){
        if(capacidadeTanque>0 && capacidadeTanque<100){
            this.capacidadeTanque = capacidadeTanque;
        }
    }

    public int getCapacidadeTanque(){
        return this.capacidadeTanque;
    }

    public void abastecer(double combustivel){
        if(combustivel<this.capacidadeTanque){
            this.combustivel = combustivel;
        } else{
            this.combustivel = this.capacidadeTanque;
        }  
    }

    public double getCombustivel(){
        return this.combustivel;
    }

    private void setVelocidadeMaxima(double velocidadeMaxima){
        if(velocidadeMaxima>0 && velocidadeMaxima<350){
            this.velocidadeMaxima = velocidadeMaxima;
        }
    }

    public double getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }

    public String ligar(){
        if(this.combustivel>0){
            this.ligado = true;
            return "O carro está ligado\n";
        } else{
            return "Abasteça o carro\n";
        }
    }

    public String desligar(){
        this.ligado = false;
        this.velocidade = 0;
        return "O carro foi desligado.";
    }

    public void acelerar()
    {
        aceleracao = this.potenciaMotor*10;
        if(this.combustivel>0 && this.ligado==true){
            if(this.velocidade+aceleracao < this.velocidadeMaxima){
                this.velocidade += this.potenciaMotor * 10;   
            } else{
                this.velocidade = this.velocidadeMaxima;
            }

            if(this.combustivel<this.potenciaMotor){
                System.out.println("Não é possível acelerar. Por favor, reabasteça.");
                System.out.println(desligar());
            } else{
                this.combustivel -= this.potenciaMotor;
            }
            
            if(this.combustivel<=this.capacidadeTanque*0.1){
                System.out.println("A capacidadade do tanque está baixa. Por favor, reabasteça.");
            }
        } else{
            System.out.println("Não foi possível acelerar");
        }
    }

    public double getVelocidade(){
        return this.velocidade;
    }

    public String frear(){
        if(this.combustivel>0 && this.ligado==true){
            this.velocidade = 0;
            return "Carro freou";
        } else{
            return "Não foi possível frear";
        }
        
    }
}
