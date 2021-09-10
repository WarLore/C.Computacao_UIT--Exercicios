import java.util.Random;

/*Criar uma classe celular com os seguintes
 campos: modelo, nivelBateria, 
 ligado (tipo boolean) e som.
 O usuário pode carregar o celular,
 aumentar e diminuir o som e jogar, ao 
 jogar ele poderá escolher o jogo e a
 bateria deverá gastar quando jogar.
O jogo deverá ser um par ou impar onde 
o usuário escolher (par ou impar) e 
o sistema gera um número aleatorio e diz
se ganhou ou perdeu.
O usuário somente poderá controlar o som
e jogar se o celular estiver ligado.
Criar uma classe TestaCelular e criar 
um menu para o usuário interagir.*/

public class Celular
{
    private String modelo;
    private int nivelBateria;
    private boolean ligado;
    private int som;

    public Celular(String modelo, int nivelBateria, int nivelSom){
        setModelo(modelo);
        setNivelBateria(nivelBateria);
        setSom(nivelSom); 
    }

    private void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return this.modelo;
    }
    public int getNivelBateria() {
        return nivelBateria;
    }

    private void setNivelBateria(int nivelBateria) {
        if(nivelBateria>0 && nivelBateria<=100){
            this.nivelBateria = nivelBateria;
        }
    }

    public void carregarBateria(){
        if(this.nivelBateria<100){
            this.nivelBateria++;
        }
    }

    public boolean isLigado(){
        return this.ligado;
    }

    public String ligar() {
        if(this.nivelBateria > 0){
            this.ligado = true;
            return "Celular ligado";
        } else{
            return "Não foi possível ligar, por favor, recarregue-o";
        }
    }
    
    private void setSom(int som){
        this.som = som;
    }

    public int getSom() {
        return som;
    }

    public String aumentarVolume(int som) {
        if(this.nivelBateria>0 && this.ligado == true){
            if(som>0 && som<=100){
                if((this.som+som)>100){
                    this.som = 100;
                } else{
                    this.som += som;
                } 
            } else{
                return "Valor inválido.";
            }
            return "Nivel de volume: " + getSom();
        } else{
            return "Não é possível aumentar o volume.";
        }
    }

    public String diminuirVolume(int som){
        if(this.nivelBateria>0 && this.ligado == true){
            if(som>0 && som<=100){
                if((this.som-som)<0){
                    this.som = 0;
                } else{
                    this.som -= som;
                } 
            } else{
                return "Valor inválido.";
            }
            return "Nivel de volume: " + getSom();
        } else{
            return "Não é possível diminuir o volume.";
        } 
    }

    public String jogar(int num){
            Random numeroRandom = new Random();
            this.nivelBateria--;
            if(numeroRandom.nextInt(6) == num){
                return "Você venceu";
            } else{
                return "Voce perdeu";
            }  
    }
}